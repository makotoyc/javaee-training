package training.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class BookInterceptor {

	@AroundInvoke
	public Object interceptEjbMethod(InvocationContext ic) throws Exception{
		try {
			System.out.println("#### BookInterceptor: before EJB method.");
			return ic.proceed();
		}
		finally {
			System.out.println("#### BookInterceptor: after EJB method.");			
		}
	}

}
