package com.example.todoslitApi.repository;

import java.util.List;

import com.example.todoslitApi.dto.Todo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TodoMapper {
    @Select("SELECT * FROM todo")
    List<Todo> findAll();

    @Select("SELECT * FROM todo where id = #{id}")
    Todo findById(@Param("id") Long id);

    @Insert("Insert into todo(content) values(#{content})")
    void insert(@Param("content") String todo);

    @Update("update todo set content = #{content}, finish = #{finish} where id = #{id}")
    int update(@Param("id") Long id, @Param("finish") boolean finish, @Param("content") String content);

    @Delete("delete from todo where id = #{id}")
    int delete(@Param("id") Long id);
}