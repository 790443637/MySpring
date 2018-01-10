package com.ld;

import com.ld.domain.Person;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

public class test2 {

    @Test
    public void test() throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-context.xml");
        Person p = ctx.getBean("person2", Person.class);
        System.out.println(p);
    }

    @Test
    public void test2() throws Exception {
        Date date=new Date();
        ExpressionParser parser=new SpelExpressionParser();
        int year=parser.parseExpression("year").getValue(date,int.class);
        System.out.println(year);
    }

    @Test
    public void test3() throws Exception {
        ExpressionParser parser=new SpelExpressionParser();
        int MAX_VALUE=parser.parseExpression("T(java.lang.Integer).MAX_VALUE").getValue(int.class);
        System.out.println(MAX_VALUE);
    }
}
