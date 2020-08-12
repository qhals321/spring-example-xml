package spring_example.database;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import spring_example.beans.MemberBean;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class Mapper implements RowMapper<MemberBean> {

    @Override
    public MemberBean mapRow(ResultSet rs, int i) throws SQLException {
        MemberBean member = new MemberBean();
        member.setCar_number(rs.getString(1));
        member.setStart_date(rs.getString(2));
        member.setEnd_date(rs.getString(3));
        member.setOwner_name(rs.getString(4));
        return member;
    }
}
