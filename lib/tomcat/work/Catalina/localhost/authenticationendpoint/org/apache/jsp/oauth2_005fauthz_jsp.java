/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-27 04:25:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.application.authentication.endpoint.util.Constants;
import org.wso2.carbon.identity.oauth2.OAuth2ScopeService;
import org.wso2.carbon.identity.oauth2.bean.Scope;
import org.wso2.carbon.identity.oauth2.IdentityOAuth2ScopeException;
import org.wso2.carbon.identity.oauth.dto.ScopeDTO;
import org.wso2.carbon.identity.oauth.IdentityOAuthAdminException;
import org.wso2.carbon.identity.oauth.OAuthAdminServiceImpl;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.File;
import java.util.Set;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import org.apache.commons.lang.StringUtils;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;

public final class oauth2_005fauthz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/includes/init-url.jsp", Long.valueOf(1656303713819L));
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1656303713851L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.wso2.carbon.identity.oauth2.OAuth2ScopeService");
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.oauth2.bean.Scope");
    _jspx_imports_classes.add("org.wso2.carbon.identity.oauth2.IdentityOAuth2ScopeException");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil");
    _jspx_imports_classes.add("java.util.stream.Collectors");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("java.util.stream.Stream");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.apache.commons.collections.CollectionUtils");
    _jspx_imports_classes.add("org.wso2.carbon.identity.oauth.IdentityOAuthAdminException");
    _jspx_imports_classes.add("org.wso2.carbon.identity.oauth.dto.ScopeDTO");
    _jspx_imports_classes.add("org.wso2.carbon.identity.oauth.OAuthAdminServiceImpl");
    _jspx_imports_classes.add("org.wso2.carbon.identity.application.authentication.endpoint.util.Constants");
    _jspx_imports_classes.add("org.wso2.carbon.identity.core.util.IdentityTenantUtil");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String identityServerEndpointContextParam = application.getInitParameter("IdentityServerEndpointContextURL");
    String samlssoURL = "../samlsso";
    String commonauthURL = "../commonauth";
    String oauth2AuthorizeURL = "../oauth2/authorize";
    String oidcLogoutURL = "../oidc/logout";
    String openidServerURL = "../openidserver";
    String logincontextURL = "../logincontext";
    if (StringUtils.isNotBlank(identityServerEndpointContextParam)) {
        samlssoURL = identityServerEndpointContextParam + "/samlsso";
        commonauthURL = identityServerEndpointContextParam + "/commonauth";
        oauth2AuthorizeURL = identityServerEndpointContextParam + "/oauth2/authorize";
        oidcLogoutURL = identityServerEndpointContextParam + "/oidc/logout";
        openidServerURL = identityServerEndpointContextParam + "/oidc/logout";
        logincontextURL = identityServerEndpointContextParam + "/logincontext";
    }
    
    String tenantDomain;
    if (IdentityTenantUtil.isTenantQualifiedUrlsEnabled()) {
        tenantDomain = IdentityTenantUtil.getTenantDomainFromContext();
    } else {
        tenantDomain = request.getParameter("tenantDomain");
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    String app = request.getParameter("application");
    String scopeString = request.getParameter("scope");
    boolean displayScopes = Boolean.parseBoolean(getServletContext().getInitParameter("displayScopes"));

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <!-- header -->\n");
      out.write("    ");

        File headerFile = new File(getServletContext().getRealPath("extensions/header.jsp"));
        if (headerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/header.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-portal layout authentication-portal-layout\">\n");
      out.write("    <main class=\"center-segment\">\n");
      out.write("        <div class=\"ui container medium center aligned middle aligned\">\n");
      out.write("\n");
      out.write("            <!-- product-title -->\n");
      out.write("            ");

                File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                if (productTitleFile.exists()) {
            
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-title.jsp", out, false);
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"ui segment\">\n");
      out.write("                <form class=\"ui large form\" action=\"");
      out.print(oauth2AuthorizeURL);
      out.write("\" method=\"post\" id=\"profile\"\n");
      out.write("                      name=\"oauth2_authz\">\n");
      out.write("                    <h4>");
      out.print(Encode.forHtml(request.getParameter("application")));
      out.write("\n");
      out.write("                        ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "request.access.profile"));
      out.write(":</h4>\n");
      out.write("\n");
      out.write("                    <div class=\"field\">\n");
      out.write("                        ");

                            if (displayScopes && StringUtils.isNotBlank(scopeString)) {
                                // Remove "openid" from the scope list to display.
                                List<String> openIdScopes = Stream.of(scopeString.split(" "))
                                        .filter(x -> !StringUtils.equalsIgnoreCase(x, "openid"))
                                        .collect(Collectors.toList());

                                if (CollectionUtils.isNotEmpty(openIdScopes)) {
                        
      out.write("\n");
      out.write("                        <div class=\"ui segment\" style=\"text-align: left;\">\n");
      out.write("                            <h5>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "requested.scopes"));
      out.write("</h5>\n");
      out.write("                            <div class=\"scopes-list ui list\">\n");
      out.write("                                ");

                                    try {
                                        String scopesAsString = String.join(" ", openIdScopes);
                                        Set<Scope> scopes = new OAuth2ScopeService().getScopes(null, null,
                                                true, scopesAsString);

                                        for (Scope scope : scopes) {
                                            String displayName = scope.getDisplayName();
                                            String description = scope.getDescription();
                                            openIdScopes.remove(scope.getName());

                                            if (displayName != null) {
                                
      out.write("\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <i class=\"check circle outline icon\"></i>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div class=\"header\">\n");
      out.write("                                            ");
      out.print(Encode.forHtml(displayName));
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
 if (description != null) { 
      out.write("\n");
      out.write("                                        <div class=\"description\">\n");
      out.write("                                            ");
      out.print(Encode.forHtml(description));
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
 } 
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                            }
                                        }
                                    } catch (IdentityOAuth2ScopeException e) {
                                        // Ignore the error
                                    }

                                    // Unregistered scopes if exist, get the consent with provided scope name.
                                    if (CollectionUtils.isNotEmpty(openIdScopes)) {
                                        for (String scope : openIdScopes) {
                                
      out.write("\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <i class=\"check circle outline icon\"></i>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div class=\"header\">\n");
      out.write("                                            ");
      out.print(Encode.forHtml(scope));
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                        }
                                    }
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

                                }
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"ui divider hidden\"></div>\n");
      out.write("                    \n");
      out.write("                        <div class=\"field\">\n");
      out.write("                            <div class=\"ui checkbox\">\n");
      out.write("                                <input\n");
      out.write("                                    tabindex=\"3\"\n");
      out.write("                                    type=\"checkbox\"\n");
      out.write("                                    id=\"rememberApproval\"\n");
      out.write("                                    name=\"rememberApproval\"\n");
      out.write("                                    data-testid=\"oauth2-consent-page-remember-approval-checkbox\"\n");
      out.write("                                />\n");
      out.write("                                <label>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "remember.my.consent"));
      out.write("</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        <div class=\"ui divider hidden\"></div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"align-right buttons\">\n");
      out.write("                        <input type=\"hidden\" name=\"");
      out.print(Constants.SESSION_DATA_KEY_CONSENT);
      out.write("\"\n");
      out.write("                            value=\"");
      out.print(Encode.forHtmlAttribute(request.getParameter(Constants.SESSION_DATA_KEY_CONSENT)));
      out.write("\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"consent\" id=\"consent\" value=\"deny\"/>\n");
      out.write("\n");
      out.write("                        <input class=\"ui large button link-button\" type=\"reset\"\n");
      out.write("                               onclick=\"deny(); return false;\"\n");
      out.write("                               value=\"");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle,"deny"));
      out.write("\"/>\n");
      out.write("                        <input type=\"button\" class=\"ui primary large button\" id=\"approve\" name=\"approve\"\n");
      out.write("                               onclick=\"approved(); return false;\"\n");
      out.write("                               value=\"");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle,"allow"));
      out.write(" \"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <div class=\"ui modal mini\" id=\"modal_claim_validation\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h4 class=\"modal-title\">");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "requested.scopes"));
      out.write("</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "please.select.approve.always"));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"actions\">\n");
      out.write("            <button type=\"button\" class=\"ui primary button\"  onclick=\"hideModal(this)\">\n");
      out.write("                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "ok"));
      out.write("\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- product-footer -->\n");
      out.write("    ");

        File productFooterFile = new File(getServletContext().getRealPath("extensions/product-footer.jsp"));
        if (productFooterFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <!-- footer -->\n");
      out.write("    ");

        File footerFile = new File(getServletContext().getRealPath("extensions/footer.jsp"));
        if (footerFile.exists()) {
    
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        function approved() {\n");
      out.write("            var isApproveAlwaysChecked = $(\"#rememberApproval\").is(':checked');\n");
      out.write("        \n");
      out.write("            // Check if the remember approval checkbox is selected, if so set the consent\n");
      out.write("            // input value to `approveAlways` else set it to `approve`.\n");
      out.write("            if (isApproveAlwaysChecked) {\n");
      out.write("                document.getElementById('consent').value = \"approveAlways\";\n");
      out.write("            } else {\n");
      out.write("                document.getElementById('consent').value = \"approve\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            document.getElementById(\"profile\").submit();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function hideModal(elem) {\n");
      out.write("            $(elem).closest('.modal').modal('hide');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function deny() {\n");
      out.write("            document.getElementById('consent').value = \"deny\";\n");
      out.write("            document.getElementById(\"profile\").submit();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
