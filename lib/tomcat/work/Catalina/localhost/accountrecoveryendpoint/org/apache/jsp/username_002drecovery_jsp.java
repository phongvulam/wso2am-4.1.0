/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-06-27 04:24:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.identity.base.IdentityRuntimeException;
import org.wso2.carbon.identity.captcha.util.CaptchaUtil;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil;
import org.wso2.carbon.identity.mgt.endpoint.util.client.ApiException;
import org.wso2.carbon.identity.mgt.endpoint.util.client.api.ReCaptchaApi;
import org.wso2.carbon.identity.mgt.endpoint.util.client.api.UsernameRecoveryApi;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.Claim;
import org.wso2.carbon.identity.mgt.endpoint.util.client.model.ReCaptchaProperties;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;

public final class username_002drecovery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/tenant-resolve.jsp", Long.valueOf(1656303692295L));
    _jspx_dependants.put("/includes/localize.jsp", Long.valueOf(1656303702918L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.Claim");
    _jspx_imports_classes.add("org.apache.commons.lang.StringUtils");
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.ApiException");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointUtil");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.IdentityManagementEndpointConstants");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.nio.charset.StandardCharsets");
    _jspx_imports_classes.add("org.wso2.carbon.identity.base.IdentityRuntimeException");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.model.ReCaptchaProperties");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.owasp.encoder.Encode");
    _jspx_imports_classes.add("java.util.ResourceBundle");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.EncodedControl");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.api.UsernameRecoveryApi");
    _jspx_imports_classes.add("org.wso2.carbon.identity.mgt.endpoint.util.client.api.ReCaptchaApi");
    _jspx_imports_classes.add("org.wso2.carbon.identity.captcha.util.CaptchaUtil");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.mgt.recovery.endpoint.i18n.Resources";
    ResourceBundle recoveryResourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(),
            new EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String tenantDomain;
    if (IdentityTenantUtil.isTenantQualifiedUrlsEnabled()) {
        tenantDomain = IdentityTenantUtil.getTenantDomainFromContext();
    } else {
        tenantDomain = request.getParameter("tenantDomain");
        if (StringUtils.isBlank(tenantDomain)) {
            tenantDomain = request.getParameter(IdentityManagementEndpointConstants.TENANT_DOMAIN);
        }
    }

      out.write('\n');
      out.write('\n');
      out.write('\n');

    if (!Boolean.parseBoolean(application.getInitParameter(
            IdentityManagementEndpointConstants.ConfigConstants.ENABLE_EMAIL_NOTIFICATION))) {
        response.sendError(HttpServletResponse.SC_FOUND);
        return;
    }

    ReCaptchaApi reCaptchaApi = new ReCaptchaApi();

    try {
        ReCaptchaProperties reCaptchaProperties = reCaptchaApi.getReCaptcha(tenantDomain, true, "ReCaptcha",
                "username-recovery");

        if (reCaptchaProperties != null && reCaptchaProperties.getReCaptchaEnabled()) {
            Map<String, List<String>> headers = new HashMap<>();
            headers.put("reCaptcha", Arrays.asList(String.valueOf(true)));
            headers.put("reCaptchaAPI", Arrays.asList(reCaptchaProperties.getReCaptchaAPI()));
            headers.put("reCaptchaKey", Arrays.asList(reCaptchaProperties.getReCaptchaKey()));
            IdentityManagementEndpointUtil.addReCaptchaHeaders(request, headers);
        }
    } catch (ApiException e) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", e.getMessage());
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    boolean error = IdentityManagementEndpointUtil.getBooleanValue(request.getAttribute("error"));
    String errorMsg = IdentityManagementEndpointUtil.getStringValue(request.getAttribute("errorMsg"));

    boolean isFirstNameInClaims = false;
    boolean isLastNameInClaims = false;
    boolean isEmailInClaims = false;
    List<Claim> claims;
    UsernameRecoveryApi usernameRecoveryApi = new UsernameRecoveryApi();
    try {
        claims = usernameRecoveryApi.getClaimsForUsernameRecovery(tenantDomain, true);
    } catch (ApiException e) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", e.getMessage());
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    if (claims == null || claims.size() == 0) {
        request.setAttribute("error", true);
        request.setAttribute("errorMsg", IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                "No.recovery.supported.claims.found"));
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return;
    }

    for (Claim claim : claims) {
        if (StringUtils.equals(claim.getUri(),
                IdentityManagementEndpointConstants.ClaimURIs.FIRST_NAME_CLAIM)) {
            isFirstNameInClaims = true;
        }
        if (StringUtils.equals(claim.getUri(), IdentityManagementEndpointConstants.ClaimURIs.LAST_NAME_CLAIM)) {
            isLastNameInClaims = true;
        }
        if (StringUtils.equals(claim.getUri(),
                IdentityManagementEndpointConstants.ClaimURIs.EMAIL_CLAIM)) {
            isEmailInClaims = true;
        }
    }

    boolean isSaaSApp = Boolean.parseBoolean(request.getParameter("isSaaSApp"));

    boolean reCaptchaEnabled = false;
    if (request.getAttribute("reCaptcha") != null &&
            "TRUE".equalsIgnoreCase((String) request.getAttribute("reCaptcha"))) {
        reCaptchaEnabled = true;
    }

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
      out.write("\n");
      out.write("    ");

        if (reCaptchaEnabled) {
            String reCaptchaAPI = CaptchaUtil.reCaptchaAPIURL();
    
      out.write("\n");
      out.write("    <script src='");
      out.print((reCaptchaAPI));
      out.write("'></script>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-portal layout recovery-layout\">\n");
      out.write("    <main class=\"center-segment\">\n");
      out.write("        <div class=\"ui container large center aligned middle aligned\">\n");
      out.write("            <!-- product-title -->\n");
      out.write("            ");

                File productTitleFile = new File(getServletContext().getRealPath("extensions/product-title.jsp"));
                if (productTitleFile.exists()) {
            
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "extensions/product-title.jsp", out, false);
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/product-title.jsp", out, false);
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            <div class=\"ui segment\">\n");
      out.write("                <h2>");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "Recover.username"));
      out.write("</h2>\n");
      out.write("                ");
 if (error) { 
      out.write("\n");
      out.write("                    <div class=\"ui visible negative message\" id=\"server-error-msg\">\n");
      out.write("                        ");
      out.print( IdentityManagementEndpointUtil.i18nBase64(recoveryResourceBundle, errorMsg) );
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <div class=\"ui negative message\" id=\"error-msg\" hidden=\"hidden\"></div>\n");
      out.write("\n");
      out.write("                ");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "Enter.detail.to.recover.uname"));
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"ui divider hidden\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"segment-form\">\n");
      out.write("                    <form class=\"ui large form\" method=\"post\" action=\"verify.do\" id=\"recoverDetailsForm\">\n");
      out.write("                        ");
 if (isFirstNameInClaims || isLastNameInClaims) { 
      out.write("\n");
      out.write("                        <div class=\"field\">\n");
      out.write("                            <label>");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "name"));
      out.write("</label>\n");
      out.write("                            <div class=\"two fields\">\n");
      out.write("                                ");
 if (isFirstNameInClaims) { 
      out.write("\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <input id=\"first-name\" type=\"text\" name=\"http://wso2.org/claims/givenname\"\n");
      out.write("                                        placeholder=\"");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                                            "First.name"));
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                                ");
 if (isLastNameInClaims) { 
      out.write("\n");
      out.write("                                <div class=\"field\">\n");
      out.write("                                    <input id=\"last-name\" type=\"text\" name=\"http://wso2.org/claims/lastname\"\n");
      out.write("                                        placeholder=\"");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                                            "Last.name"));
      out.write("\" />\n");
      out.write("                                </div>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            String callback = request.getParameter("callback");

                            if (StringUtils.isBlank(callback)) {
                                callback = IdentityManagementEndpointUtil.getUserPortalUrl(
                                        application.getInitParameter(IdentityManagementEndpointConstants.ConfigConstants.USER_PORTAL_URL));
                            }

                            if (callback != null) {
                        
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <input type=\"hidden\" name=\"callback\" value=\"");
      out.print(Encode.forHtmlAttribute(callback) );
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }

                            if (isEmailInClaims) { 
      out.write("\n");
      out.write("                        <div class=\"field\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                                    "Email"));
      out.write("</label>\n");
      out.write("                            <input id=\"email\" type=\"email\" name=\"http://wso2.org/claims/emailaddress\"\n");
      out.write("                                    class=\"form-control\"\n");
      out.write("                                    data-validate=\"email\">\n");
      out.write("                        </div>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                        ");
 if (!isSaaSApp && (StringUtils.isNotEmpty(tenantDomain) && !error)) { 
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <input id=\"tenant-domain\" type=\"hidden\" name=\"tenantDomain\" value=\"");
      out.print(Encode.forHtmlAttribute(tenantDomain));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                        <div class=\"field\">\n");
      out.write("                            <label class=\"control-label\">\n");
      out.write("                                ");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "Tenant.domain"));
      out.write("\n");
      out.write("                            </label>\n");
      out.write("                            <input id=\"tenant-domain\" type=\"text\" name=\"tenantDomain\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                        <input type=\"hidden\" id=\"isUsernameRecovery\" name=\"isUsernameRecovery\" value=\"true\">\n");
      out.write("\n");
      out.write("                        ");
 for (Claim claim : claims) {
                            if (claim.getRequired() &&
                                    !StringUtils.equals(claim.getUri(),
                                            IdentityManagementEndpointConstants.ClaimURIs.FIRST_NAME_CLAIM) &&
                                    !StringUtils.equals(claim.getUri(),
                                            IdentityManagementEndpointConstants.ClaimURIs.LAST_NAME_CLAIM) &&
                                    !StringUtils.equals(claim.getUri(),
                                            IdentityManagementEndpointConstants.ClaimURIs.EMAIL_CLAIM)) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"field\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(IdentityManagementEndpointUtil.i18nBase64(recoveryResourceBundle,
                                    claim.getDisplayName()));
      out.write("\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"text\" name=\"");
      out.print( Encode.forHtmlAttribute(claim.getUri()) );
      out.write("\"\n");
      out.write("                                    class=\"form-control\"/>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                                }
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            if (reCaptchaEnabled) {
                                String reCaptchaKey = CaptchaUtil.reCaptchaSiteKey();
                        
      out.write("\n");
      out.write("                        <div class=\"field\">\n");
      out.write("                            <div class=\"g-recaptcha\"\n");
      out.write("                                    data-sitekey=\n");
      out.write("                                            \"");
      out.print(Encode.forHtmlContent(reCaptchaKey));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"ui divider hidden\"></div>\n");
      out.write("\n");
      out.write("                        <div class=\"align-right buttons\">\n");
      out.write("                            <a href=\"javascript:goBack()\" class=\"ui button link-button\">\n");
      out.write("                                ");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle, "Cancel"));
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <button id=\"recoverySubmit\"\n");
      out.write("                                    class=\"ui primary large button\"\n");
      out.write("                                    type=\"submit\">");
      out.print(IdentityManagementEndpointUtil.i18n(recoveryResourceBundle,
                                    "Submit"));
      out.write("\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
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
      out.write("        function goBack() {\n");
      out.write("            window.history.back();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("\n");
      out.write("            $(\"#recoverDetailsForm\").submit(function (e) {\n");
      out.write("                var errorMessage = $(\"#error-msg\");\n");
      out.write("                errorMessage.hide();\n");
      out.write("\n");
      out.write("                ");
 if (isFirstNameInClaims){ 
      out.write("\n");
      out.write("                    var firstName = $(\"#first-name\").val();\n");
      out.write("\n");
      out.write("                    if (firstName == '') {\n");
      out.write("                        errorMessage.text(\"Please fill the first name.\");\n");
      out.write("                        errorMessage.show();\n");
      out.write("                        $(\"html, body\").animate({scrollTop: errorMessage.offset().top}, 'slow');\n");
      out.write("\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                ");
 if (reCaptchaEnabled) { 
      out.write("\n");
      out.write("                    var reCaptchaResponse = $(\"[name='g-recaptcha-response']\")[0].value;\n");
      out.write("\n");
      out.write("                    if (reCaptchaResponse.trim() == '') {\n");
      out.write("                        errorMessage.text(\"Please select reCaptcha.\");\n");
      out.write("                        errorMessage.show();\n");
      out.write("                        $(\"html, body\").animate({scrollTop: errorMessage.offset().top}, 'slow');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
