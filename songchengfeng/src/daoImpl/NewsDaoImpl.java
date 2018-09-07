package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iotek.util.DBUtils;

import bean.News;
import dao.NewsDao;

public class NewsDaoImpl implements NewsDao {

	@Override
	public List<News> queryMail(String receivePerson) {
		List<News> result = new ArrayList<News>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select id,title,time from news";
		try {
			conn = DBUtils.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, receivePerson);
			rs = pstmt.executeQuery();
			News news = null;
			while (rs.next()) {
				result.add(combineNews(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(rs, pstmt, conn);
		}

		return result;	
		
	}

	@Override
	public List<News> queryMailByPage(String receivePerson, int pageSize, int currPage) {
		List<News> list = new ArrayList<News>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConn();
			String sql = "select id,title,time from news ";
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, receivePerson);
			pstmt.setInt(2, (currPage - 1) * pageSize);
			pstmt.setInt(3, pageSize);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(combineNews(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(rs, pstmt, conn);
		}
		return list;
		
	}

	@Override
	public int queryMailCount(String receivePerson) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConn();
			String sql = "select count(1) cc from t_mail where receive_person=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, receivePerson);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("cc");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(rs, pstmt, conn);
		}
		return 0;
		
	}

	@Override
	public News queryMailById(int id) {
		News mail = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtils.getConn();
			String sql = "select id,title,time from news";
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mail = combineNews(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(rs, pstmt, conn);
		}
		return mail;
		return null;
	}

}
