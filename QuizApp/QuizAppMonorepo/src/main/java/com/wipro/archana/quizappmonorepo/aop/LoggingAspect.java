package com.wipro.archana.quizappmonorepo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



import lombok.extern.slf4j.Slf4j;

@Aspect    // telling to spring this is the extra logic i am writting
@Component //asking spring to  take care of this class(object creation)
@Slf4j
public class LoggingAspect {
	


	    @Before("execution(* com.wipro.archana.quizappmonorepo.controller.QuestionController.addQuestion(..))")
	    public void logBefore(JoinPoint joinPoint) {
	        System.out.println("🔹 Before Method: " + joinPoint.getSignature().getName());
	    }

	    @AfterReturning(pointcut = "execution(* com.wipro.archana.quizappmonorepo.controller.QuestionController.addQuestion(..))", returning = "result")
	    public void logAfterReturning(JoinPoint joinPoint, Object result) {
	        System.out.println("✅ After Method: " + joinPoint.getSignature().getName() + " | Returned: " + result);
	    }


	
	

}

