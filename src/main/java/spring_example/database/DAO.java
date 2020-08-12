package spring_example.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring_example.beans.MemberBean;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class DAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private Mapper mapper;



    public List<MemberBean> selectMember(){
        String sql = "select * from member";
        List<MemberBean> list = jdbcTemplate.query(sql, mapper);
        return list;
    }

}
