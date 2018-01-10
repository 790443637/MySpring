package com.ld.dao.impl;

import com.ld.dao.IEmployeeDao;
import com.ld.domain.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl2 extends JdbcDaoSupport implements IEmployeeDao {

    public void save(Employee e) {
        String sql="insert into employee(name,password) values(?,?)";
        Object[] params={e.getName(),e.getPassword()};
        this.getJdbcTemplate().update(sql, params);
    }

    public void update(Employee e) {
        String sql="update employee set name=?,password=? where id=?";
        Object[] params={e.getName(),e.getPassword(),e.getId()};
        this.getJdbcTemplate().update(sql, params);
    }

    public void delete(Long id) {
        String sql="delete from employee where id=?";
        this.getJdbcTemplate().update(sql, id);
    }

    public Employee get(Long id) {
        String sql="select * from employee where id=?";
        Employee query = this.getJdbcTemplate().query(sql,new ResultSetExtractor<Employee>(){
            public Employee extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                Employee e=null;
                while(rs.next()){
                    e=new Employee();
                    e.setId(Long.valueOf(rs.getInt("id")));
                    e.setName(rs.getString("name"));
                    e.setPassword(rs.getString("password"));
                }
                return e;
            }
        }, id);
        return query;
    }

    public List<Employee> list() {
        String sql="select * from employee";
        List<Employee> query = this.getJdbcTemplate().query(sql,new ResultSetExtractor<List<Employee>>(){
            public List<Employee> extractData(ResultSet rs)
                    throws SQLException, DataAccessException {
                List<Employee> list=new ArrayList<Employee>();
                Employee e=null;
                while(rs.next()){
                    e=new Employee();
                    e.setId(Long.valueOf(rs.getInt("id")));
                    e.setName(rs.getString("name"));
                    e.setPassword(rs.getString("password"));
                    list.add(e);
                }
                return list;
            }
        });
        return query;
    }

    public List<Employee> list2() {
        String sql="select * from employee";
        List<Employee> query = this.getJdbcTemplate().query(sql,new RowMapper<Employee>(){
            public Employee mapRow(ResultSet rs, int rowNum)
                    throws SQLException {
                Employee e=new Employee();
                e.setId(Long.valueOf(rs.getInt("id")));
                e.setName(rs.getString("name"));
                e.setPassword(rs.getString("password"));
                return e;
            }
        });
        return query;
    }
}
