package common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
