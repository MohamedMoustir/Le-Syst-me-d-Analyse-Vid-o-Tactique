package com.savt.backend.infrastructure.config;

import com.savt.backend.shared.exception.ForbiddenException;
import com.savt.backend.shared.exception.UnauthorizedException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestPath = request.getRequestURI();

        if (requestPath.startsWith("/api/auth")) {
            return true;
        }

        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("e") == null) {
            throw new UnauthorizedException("Session expirée ou non authentifié. Veuillez vous connecter.");
        }

        Object roleObj = session.getAttribute("z");
        String userRle = (roleObj != null) ? roleObj.toString() : "";

        if (requestPath.startsWith("/api/") ) {

            if ("CLIENT".equals(userRle)) {

                if (!request.getMethod().equalsIgnoreCase("GET")) {
                    throw new ForbiddenException("Accès refusé. Mode lecture seule pour les CLIENTS.");
                }


                if (requestPath.equals("/api/")) {
                    throw new ForbiddenException("Accès refusé. Vous ne pouvez pas consulter la liste des autres clients.");
                }
                if (requestPath.startsWith("/api/")) {
                    boolean isMyOrdersEndpoint = requestPath.contains("/my_orders");
                    if ("GET".equalsIgnoreCase(request.getMethod()) && isMyOrdersEndpoint) {
                        return true;
                    }
                    throw new ForbiddenException("Accès refusé. Les clients ne peuvent pas consulter l'historique.");
                }
            }


        }

        return true;
    }
}