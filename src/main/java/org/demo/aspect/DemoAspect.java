package org.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Pointcut("execution(* org.demo.service.*.*.*(..))")
    public void cut() {
    }

    @Pointcut("execution(* org.demo.service.*.*.add*(..))")
    public void add() {
    }


    @After("add()")
    public void doAfter() {
        System.out.println("AOP ------------ after");
    }

    @Before("cut()")
    public void logAddB(JoinPoint jp) {

        System.out.println(jp.getSignature());
        System.out.println(jp.getSignature().getName());
        System.out.println(jp.getSignature().getDeclaringType());
        System.out.println(jp.getSignature().getDeclaringTypeName());
        System.out.println(jp.getSignature().getModifiers());
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println(jp.getSourceLocation());
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println(jp.getKind());
        System.out.println("-----------------------------------------------------------------------------------------");



        System.out.println(jp.getArgs());
        System.out.println(jp.getArgs().clone());
        System.out.println(jp.getArgs().length);
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println(jp.getStaticPart());
        System.out.println(jp.getStaticPart().getId());
        System.out.println(jp.getStaticPart().getKind());
        System.out.println(jp.getStaticPart().getSignature());
        System.out.println(jp.getStaticPart().getSourceLocation());
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println(jp.getTarget());
        System.out.println("-----------------------------------------------------------------------------------------");


        System.out.println(jp.getThis());


    }



}
