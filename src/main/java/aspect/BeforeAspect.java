package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
@Aspect
//Configuration
@Configuration
public class BeforeAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

//What kind of methods are intercepted
	//execute (* PACKAGE.*.*(..))
	@Before("execution(* com.springboot.basics.aop.springaopfirst..*.*(..))")
	public void before(JoinPoint joinPoint)
	{
		//What to do?
		logger.info("INtercepted a method call {}",joinPoint );
		
	}
}
