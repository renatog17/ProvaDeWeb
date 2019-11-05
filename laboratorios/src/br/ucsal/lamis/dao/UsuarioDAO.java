package br.ucsal.lamis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ucsal.lamis.model.Usuario;
import br.ucsal.lamis.util.BancoUtil;

public class UsuarioDAO {

	public boolean autenticador(Usuario u) {
		boolean autenticado = false;
		Connection c = BancoUtil.getConnection();
		try {
			String sql = "select * from usuarios where login=? and senha=?;";
			PreparedStatement pstmt = c.prepareStatement(sql);
			pstmt.setString(1, u.getLogin());
			pstmt.setString(2, u.getSenha());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				autenticado = true;
			}
			rs.close();
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return autenticado;
	}
}
