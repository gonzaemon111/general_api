package dev.gonzaemon111.GeneralAPI.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LogAspect {
    // //AOP実装
    @Before("execution(* dev.gonzaemon111.GeneralAPI.*.*.*(..))")
    public void startLog(JoinPoint jp){
      log.info(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを開始します");
      System.out.println(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを開始します");
    }
    //AOP実装
    @After("within(dev.gonzaemon111.GeneralAPI.*.*.*)")
    public void endLog(JoinPoint jp) {
      log.info(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを終了します");
      System.out.println(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを終了します");
    }
}
