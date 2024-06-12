package de.ait_tr.g_40_shop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {

    private Logger logger = LoggerFactory.getLogger(AspectLogging.class);

    // Pointcut для всех методов всех сервисов
    @Pointcut("execution(* de.ait_tr.g_40_shop.service.*.*(..))")
    public void allServiceMethods() {}

    // Before - логируем вызов метода и его параметры
    @Before("allServiceMethods()")
    public void logMethodCall(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method {} of class {} called with parameters: {}", methodName, className, args);
    }

    // After - логируем завершение метода
    @After("allServiceMethods()")
    public void logMethodEnd(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Method {} of class {} finished", methodName, className);
    }

    // AfterReturning - логируем успешное завершение метода и возвращаемый результат
    @AfterReturning(pointcut = "allServiceMethods()", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        logger.info("Method {} of class {} successfully returned result: {}", methodName, className, result);
    }

    // AfterThrowing - логируем возникновение ошибки
    @AfterThrowing(pointcut = "allServiceMethods()", throwing = "e")
    public void logMethodError(JoinPoint joinPoint, Throwable e) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        logger.error("Method {} of class {} threw an exception: {}", methodName, className, e.getMessage());
    }
}