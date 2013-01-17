package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import org.claros.chat.controllers.PreferencesController;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/ajax.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fajax_005fAjaxDiv_0026_005furl_005ftimeout_005fid_005fhandler;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fajax_005fAjaxDiv_0026_005furl_005ftimeout_005fid_005fhandler = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fajax_005fAjaxDiv_0026_005furl_005ftimeout_005fid_005fhandler.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
  
	response.setHeader("Expires","-1");
	response.setHeader("Pragma","no-cache");
	response.setHeader("Cache-control","no-cache");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<span id=\"loading\" style=\"font-family: Arial, Helvetica, sans-serif; font-size: 14px;color: black;\">Loading... Please wait.</span>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Claros Chat 1.0</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/mm_functions.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/chatwin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/chat.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/scroll.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/prototype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/rico.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/operations.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cjajax.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/md5.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/date.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/playa.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"yui/yahoo/yahoo.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"yui/event/event.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"yui/connection/connection.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"yui/dom/dom.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"yui/dragdrop/dragdrop.js\" ></script>\r\n");
      out.write("<link href=\"css/chat.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/scroll.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function unloadHandler() {\r\n");
      out.write("\tvar url = \"logout.cl\";\r\n");
      out.write("\tvar callback = {\r\n");
      out.write("\t  success: \tfunction(o) {},\r\n");
      out.write("\t  failure: \tfunction(o) {},\r\n");
      out.write("\t  argument: []\r\n");
      out.write("\t}\r\n");
      out.write("\tvar request = YAHOO.util.Connect.asyncRequest('GET', url, callback, null);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"preloadImages();disableLoading();initLogin();callListener();statusTimerIncrement();statusListener();\" onresize=\"initToolbar()\" onclick=\"outInfoWin()\" onunload=\"unloadHandler()\" onmousemove=\"arrangeStatus();\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"contacts\">\r\n");
      out.write("<table width=\"189\" height=\"430\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("\t<td width=\"189\" height=\"34\" background=\"img/bg/contact_win_top.gif\" id=\"contactshandle\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("\t<td valign=\"top\" background=\"img/bg/contact_win_bg.gif\" height=\"337\">\r\n");
      out.write("\t\t<table width=\"189\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"337\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td width=\"19\">&nbsp;</td>\r\n");
      out.write("\t\t\t<td width=\"154\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_ajax_005fAjaxDiv_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"16\">&nbsp;</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td width=\"189\" height=\"25\" align=\"right\" valign=\"bottom\" background=\"img/bg/contact_win_bg.gif\"><a href=\"javascript:addContact()\"><img src=\"img/buttons/add_buddy.gif\" width=\"55\" height=\"19\" border=\"0\" style=\"margin-right:20px;\"/></a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("\t<td width=\"189\" height=\"34\" background=\"img/bg/contact_win_bottom.gif\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"infowin\" style=\"visibility:hidden\" onmouseover=\"overInfoWin()\" >\r\n");
      out.write(" <table width=\"199\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td height=\"16\" background=\"img/bg/info_bg_top.gif\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td height=\"60\" valign=\"middle\" background=\"img/bg/info_bg.gif\">\r\n");
      out.write("\t\t<table width=\"179\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t  \t<td align=\"center\">\r\n");
      out.write("\t\t  \t\t<img src=\"img/avatar_load.gif\" id=\"avatar\" /><br/>\r\n");
      out.write("\t\t  \t</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<span id=\"infotexttitle\" style=\"overflow: none;margin-top: 4px;\">&nbsp;</span>\r\n");
      out.write("\t\t\t\t<p id=\"infotextstatus\">&nbsp;</p>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td><img src=\"img/spacer.gif\" width=\"10\" height=\"8\"/></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td align=\"center\"><a href=\"javascript:openChat()\"><img src=\"img/buttons/chat.gif\" border=\"0\"/></a>&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"javascript:removeUser()\"><img src=\"img/buttons/remove.gif\" border=\"0\" /></a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td height=\"16\" background=\"img/bg/info_bg_bottom.gif\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write(" </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <div id=\"toolbar\" style=\"height:58px;display:none;\">\r\n");
      out.write("   <table width=\"100%\" height=\"58\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td width=\"1%\" height=\"58\"><img src=\"img/bg/toolbar_left.gif\" width=\"23\" height=\"58\"/></td>\r\n");
      out.write("       <td width=\"33%\" background=\"img/bg/toolbar_bg.gif\">\r\n");
      out.write("\t\t  <div id=\"consolescroll\">\r\n");
      out.write("\t\t\t<div id=\"consoleText\" style=\"overflow:hidden; height:50px; width:95%\">&nbsp;</div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t   </td>\r\n");
      out.write("       <td width=\"1%\" height=\"58\" bgcolor=\"green\"><img src=\"img/bg/toolbar_seperator.gif\" width=\"17\" height=\"58\"/></td>\r\n");
      out.write("       <td width=\"33%\" align=\"center\" valign=\"middle\" background=\"img/bg/toolbar_bg.gif\" nowrap=\"nowrap\" bgcolor=\"blue\">\r\n");
      out.write("\r\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"statusTable\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td rowspan=\"2\" align=\"left\" nowrap>\r\n");
      out.write("\t\t    \t<img src=\"img/avatar.png\" height=\"48\" width=\"48\" id=\"avatarme\" class=\"avatarMe\" onmouseover=\"this.className='avatarMeHover';\" onmouseout=\"this.className='avatarMe'\" style=\"margin-right: 10px\"/>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t\t<td nowrap=\"nowrap\" valign=\"bottom\"><strong style=\"color:#272827\">Welcome <span id=\"fullName\">&nbsp;</span></strong></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td nowrap=\"nowrap\" valign=\"top\"><strong style=\"color:#272827\">Status : </strong><span id=\"statusnow\">Available</span> &nbsp;<img src=\"img/indicators/green.gif\" border=\"0\" id=\"statusindic\"/>&nbsp; <a href=\"javascript:changeStatus()\">Change</a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t   </td>\r\n");
      out.write("       <td width=\"1%\" height=\"58\"><img src=\"img/bg/toolbar_seperator.gif\" width=\"17\" height=\"58\" /></td>\r\n");
      out.write("       <td valign=\"top\" background=\"img/bg/toolbar_bg.gif\"><table border=\"0\" width=\"260\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\" style=\"margin-top:20px\">\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td width=\"13\" nowrap=\"nowrap\"><img src=\"img/ico/logout.gif\" width=\"20\" height=\"20\" /></td>\r\n");
      out.write("           <td nowrap=\"nowrap\" width=\"50\"><a href=\"javascript:logout();\" style=\"color:#0c4363;margin-left:7px;\">logout</a></td>\r\n");
      out.write("           <td width=\"20\" nowrap=\"nowrap\"><img src=\"img/ico/preferences.gif\" width=\"22\" height=\"20\" /></td>\r\n");
      out.write("           <td nowrap=\"nowrap\" width=\"65\"><a href=\"javascript:preferences()\" style=\"color:#0c4363;margin-left:7px;\">preferences</a></td>\r\n");
      out.write("           <td width=\"19\" nowrap=\"nowrap\"><img src=\"img/ico/claros.gif\" width=\"21\" height=\"20\" /></td>\r\n");
      out.write("           <td nowrap=\"nowrap\" width=\"50\"><a href=\"http://localhost:8080/chat\" target=\"_blank\" style=\"color:#0c4363;margin-left:7px;\">localhost</a></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("       </table></td>\r\n");
      out.write("       <td width=\"1%\" height=\"58\"><img src=\"img/bg/toolbar_right.gif\" width=\"23\" height=\"58\" /></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("   </table>\r\n");
      out.write(" </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"chatWin\" class=\"chatWin\" style=\"display:none;\" onmousedown=\"moveOnTop(this);\">\r\n");
      out.write("  <table width=\"234\" height=\"242\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"26\" class=\"handle\" ondblclick=\"tidyDiv(this);\"><div id=\"handle\" style=\"outline:none; height:26px;cursor:move\"><table width=\"234\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" height=\"26\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"12\">&nbsp;</td>\r\n");
      out.write("          <td width=\"14\"><img src=\"img/indicators/green.gif\" width=\"10\" height=\"10\" id=\"statusindicator\"/></td>\r\n");
      out.write("          <td width=\"187\"><div id=\"chatWinTitleBar\">&nbsp;</div></td>\r\n");
      out.write("          <td width=\"21\"><img src=\"img/spacer.gif\" width=\"17\" height=\"17\" onclick=\"hideChatWin(this.parentNode.parentNode.parentNode.parentNode.parentNode.parentNode.parentNode.parentNode.parentNode.parentNode);\" style=\"cursor: pointer;\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table></div></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"152\" valign=\"top\" background=\"img/bg/chatwin_bg.gif\"><table width=\"95%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"152\" valign=\"top\" id=\"chatWinText\">\r\n");
      out.write("\t\t  \t<div id=\"chatScroll\">\r\n");
      out.write("\t\t\t\t<div id=\"myText\" style=\"outline:hidden;\">&nbsp;</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t  </td>\t\t\t  \r\n");
      out.write("        </tr>\r\n");
      out.write("      </table></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td height=\"64\" align=\"left\" valign=\"top\" background=\"img/bg/chatwin_bottom.gif\"><label>\r\n");
      out.write("        <textarea name=\"chatWinMsg\" wrap=\"physical\" id=\"chatWinMsg\" onkeyDown=\"return(handleKeys(event, this));\"></textarea>\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"login\" style=\"display:none\">\r\n");
      out.write("\t<div id=\"logincenter\" style=\"width:428px; height:281px; outline:none; position:absolute; left: 153px; top: 76px;\">\r\n");
      out.write("\t\t<table width=\"428\" height=\"281\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td height=\"29\" background=\"img/bg/login_top.gif\" id=\"loginhandle\">&nbsp;</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td height=\"234\" valign=\"top\" background=\"img/bg/login_bg.gif\"><form id=\"loginform\" name=\"loginform\" method=\"post\" action=\"Authenticate\" onsubmit=\"return false\">\r\n");
      out.write("\t\t\t    <table width=\"427\" border=\"0\" align=\"center\" cellpadding=\"5\" cellspacing=\"0\">\r\n");
      out.write("\t\t          <tr>\r\n");
      out.write("\t\t          \t<td>&nbsp;</td>\r\n");
      out.write("\t\t            <td style=\"color:red;font-weight: bold\" id=\"loginResult\">&nbsp;</td>\r\n");
      out.write("\t\t          </tr>\r\n");
      out.write("\t\t          <tr>\r\n");
      out.write("\t\t            <td width=\"122\"><div align=\"right\">User : </div></td>\r\n");
      out.write("\t\t            <td width=\"285\"><label>\r\n");
      out.write("\t\t              <input type=\"text\" name=\"username\" tabindex=\"1\" onkeydown=\"return(loginCatchEnter(event))\" style=\"width: 200px;border: 1px solid #A3C6E8;height: 14px;font-family: Arial, Helvetica, sans-serif;font-size:11px;\"/>\r\n");
      out.write("\t\t            </label></td>\r\n");
      out.write("\t\t          </tr>\r\n");
      out.write("\t\t          <tr>\r\n");
      out.write("\t\t            <td><div align=\"right\">Password : </div></td>\r\n");
      out.write("\t\t            <td><label>\r\n");
      out.write("\t\t              <input type=\"password\" name=\"password\" tabindex=\"2\" onkeydown=\"return(loginCatchEnter(event))\" style=\"width: 200px;border: 1px solid #A3C6E8;height: 14px;font-family: Arial, Helvetica, sans-serif;font-size:11px;\"/>\r\n");
      out.write("\t\t            </label></td>\r\n");
      out.write("\t\t          </tr>\r\n");
      out.write("\t\t          <tr>\r\n");
      out.write("\t\t            <td><div align=\"right\">Server : </div></td>\r\n");
      out.write("\t\t            <td><label>\r\n");
      out.write("\t\t              <input type=\"text\" name=\"server\" tabindex=\"3\" onkeydown=\"return(loginCatchEnter(event))\" value=\"Google Talk\" readonly=\"readonly\" style=\"width: 200px;border: 1px solid #A3C6E8;height: 14px;font-family: Arial, Helvetica, sans-serif;font-size:11px;\"/>\r\n");
      out.write("\t\t            </label></td>\r\n");
      out.write("\t\t          </tr>\r\n");
      out.write("\t\t          <tr>\r\n");
      out.write("\t\t            <td>&nbsp;</td>\r\n");
      out.write("\t\t            <td><a href=\"javascript:claroslogin();\"><img src=\"img/buttons/login.gif\" border=\"0\" /></a>&nbsp;&nbsp;\r\n");
      out.write("\t\t            <img src=\"img/loading_mini.gif\" width=\"16\" height=\"16\" id=\"loginprogress\" style=\"display: none\"/>\r\n");
      out.write("\t\t            <span id=\"logintext\" style=\"color: #333333; font-style: italic\"></span>\r\n");
      out.write("\t\t            </td>\r\n");
      out.write("\t\t          </tr>\r\n");
      out.write("\t\t          \r\n");
      out.write("\t\t          <tr>\r\n");
      out.write("\t\t            <td colspan=\"2\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t              <tr>\r\n");
      out.write("\t\t                <td width=\"204\" align=\"right\"><a href=\"#\" onmouseout=\"if (!gtalkClicked) MM_swapImgRestore()\" onmouseover=\"MM_swapImage('gtalk','','img/buttons/gtalk_clicked.gif',1)\" onclick=\"selectGtalk();\"><img src=\"img/buttons/gtalk.gif\" name=\"gtalk\" width=\"188\" height=\"83\" border=\"0\" id=\"gtalk\" /></a></td>\r\n");
      out.write("\t\t                <td width=\"10\">&nbsp;</td>\r\n");
      out.write("\t\t                <td width=\"203\" align=\"left\"><a href=\"#\" onmouseout=\"if (!jabberClicked) MM_swapImgRestore()\" onmouseover=\"MM_swapImage('jabber','','img/buttons/jabber_clicked.gif',1)\" onclick=\"selectJabber();\"><img src=\"img/buttons/jabber.gif\" name=\"jabber\" width=\"188\" height=\"83\" border=\"0\" id=\"jabber\" /></a></td>\r\n");
      out.write("\t\t              </tr>\r\n");
      out.write("\t\t            </table></td>\r\n");
      out.write("\t\t          </tr>\r\n");
      out.write("\t\t        </table>\r\n");
      out.write("\t\t          </form>\r\n");
      out.write("\t\t\t  </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td height=\"18\" background=\"img/bg/login_bottom.png\">&nbsp;</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"changeStatus\" class=\"curtain\">\r\n");
      out.write("\t&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br /><form id=\"statusform\">\r\n");
      out.write("\t<table width=\"400 border=\"0\" cellspacing=\"0\" cellpadding=\"4\" align=\"center\"  height=\"315\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<strong style=\"font-size:18px;color:#999999\">Change Status</strong><hr size=\"1\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>Current Status : </td>\r\n");
      out.write("\t\t<td id=\"userStatus\"></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>New Status : </td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<select name=\"newstatus\">\r\n");
      out.write("\t\t\t  <option value=\"available\">Online</option>\r\n");
      out.write("\t\t\t  <option value=\"away\">Away</option>\r\n");
      out.write("\t\t\t  <option value=\"disturb\">Do Not Disturb</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>Status Message : </td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<textarea name=\"newstatusmsg\" cols=\"30\" rows=\"4\" style=\"width:200px; height:40px;\"></textarea>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\" style=\"font-size:16px; font-weight:bold\">\r\n");
      out.write("\t\t\t<hr size=\"1\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t[ <a href=\"javascript:saveStatus();\" style=\"color:#EBEBEB\">Save</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href=\"javascript:closeCurtain('changeStatus');\" style=\"color:#EBEBEB\">Cancel</a> ]\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"logout\" class=\"curtain\">\r\n");
      out.write("\t&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />\r\n");
      out.write("\t<table width=\"400 border=\"0\" cellspacing=\"0\" cellpadding=\"4\" align=\"center\"  height=\"315\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<strong style=\"font-size:18px;color:#999999\">Logout Confirmation!</strong><hr size=\"1\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td width=\"135\"><img src=\"img/buttons/exclamation.gif\" /></td>\r\n");
      out.write("\t\t<td>Are you sure you want to end your session?</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\" style=\"font-size:16px; font-weight:bold\">\r\n");
      out.write("\t\t\t<hr size=\"1\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t[ <a href=\"javascript:doLogout();\" style=\"color:#EBEBEB\">Yes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href=\"javascript:closeCurtain('logout');\" style=\"color:#EBEBEB\">No</a> ]\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"removeUser\" class=\"curtain\">\r\n");
      out.write("\t&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />\r\n");
      out.write("\t<table width=\"400 border=\"0\" cellspacing=\"0\" cellpadding=\"4\" align=\"center\"  height=\"315\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<strong style=\"font-size:18px;color:#999999\">Confirmation!</strong><hr size=\"1\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td width=\"135\"><img src=\"img/buttons/exclamation.gif\" /></td>\r\n");
      out.write("\t\t<td>Are you sure you want to remove <span id=\"removeFullName\"></span> from your buddies list? This operation can not be undone.</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\" style=\"font-size:16px; font-weight:bold\">\r\n");
      out.write("\t\t\t<hr size=\"1\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t[ <a href=\"javascript:doRemoveUser();\" style=\"color:#EBEBEB\">Yes</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href=\"javascript:closeCurtain('removeUser');\" style=\"color:#EBEBEB\">No</a> ]\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"addContact\" class=\"curtain\">\r\n");
      out.write("\t&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />\r\n");
      out.write("\t<form id=\"addBuddyForm\">\r\n");
      out.write("\t<table width=\"400 border=\"0\" cellspacing=\"0\" cellpadding=\"4\" align=\"center\"  height=\"315\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<strong style=\"font-size:18px;color:#999999\">Add New Buddy</strong><hr size=\"1\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>Contact Address : </td>\r\n");
      out.write("\t\t<td><input name=\"newBuddy\" id=\"newBuddy\" type=\"text\" style=\"border:solid 1px #666666; width: 200px;\"/></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t  \t<td colspan=\"2\">After submitting, your request will be sent to the user. You'll be able to chat with him/her after he/she accepts your request.</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\" style=\"font-size:16px; font-weight:bold\">\r\n");
      out.write("\t\t\t<hr size=\"1\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t[ <a href=\"javascript:doAddContact();\" style=\"color:#EBEBEB\">Send Request</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href=\"javascript:closeCurtain('addContact');\" style=\"color:#EBEBEB\">Cancel</a> ]\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"preferences\" class=\"curtain\">\r\n");
      out.write("\t&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br />&nbsp;<br /><form id=\"preferencesForm\">\r\n");
      out.write("\t<table width=\"400 border=\"0\" cellspacing=\"0\" cellpadding=\"4\" align=\"center\"  height=\"315\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<strong style=\"font-size:18px;color:#999999\">Preferences</strong><hr size=\"1\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>Name Surname : </td>\r\n");
      out.write("\t\t<td><input name=\"preffullname\" id=\"preffullname\" type=\"text\" style=\"border:solid 1px #666666; width: 150px;\"/></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>Set Status Away After : </td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td rowspan=\"2\" width=\"70\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t\t\t\t<span id=\"mins\">15</span> mins\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:prefArrUp();\"><img src=\"img/buttons/arr_up.gif\" border=\"0\" width=\"17\" height=\"17\"/></a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:prefArrDown();\"><img src=\"img/buttons/arr_down.gif\" border=\"0\" width=\"17\" height=\"17\"/></a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>Effects : </td>\r\n");
      out.write("\t\t<td><input name=\"anims\" id=\"anims\" type=\"radio\" value=\"on\" checked=\"checked\"/> On <input name=\"anims\" id=\"anims\" type=\"radio\" value=\"off\" /> Off</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td>Sound Alert : </td>\r\n");
      out.write("\t\t<td><input name=\"sndalert\" id=\"sndalert\" type=\"radio\" value=\"on\" checked=\"checked\"/> On <input name=\"sndalert\" id=\"sndalert\" type=\"radio\" value=\"off\" /> Off</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\" style=\"font-size:16px; font-weight:bold\">\r\n");
      out.write("\t\t\t<hr size=\"1\"/>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t \r\n");
      out.write("\t\t\t[ <a href=\"javascript:savePreferences();\" style=\"color:#EBEBEB\">Save</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href=\"javascript:closeCurtain('preferences');\" style=\"color:#EBEBEB\">Cancel</a> ]\t\t\t\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"askWin\">\r\n");
      out.write("\t<table width=\"200\" border=\"0\" align=\"center\" cellpadding=\"5\" cellspacing=\"0\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>User <strong>Satılmış Salakova</strong> wants to add you to his/her buddies list. What would you like to do? </td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td align=\"center\"><a href=\"javascript:allowAskOp();\"><img src=\"img/buttons/allow.gif\" width=\"72\" height=\"21\" border=\"0\" /></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"javascript:denyAskOp();\"><img src=\"img/buttons/deny.gif\" border=\"0\" /></a></td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"player\" style=\"visibility: hidden;width: 1px;height: 1px;\">\r\n");
      out.write("<object\r\n");
      out.write("\tclassid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\"\r\n");
      out.write("\twidth=\"1\"\r\n");
      out.write("\theight=\"1\"\r\n");
      out.write("\tcodebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab\"\r\n");
      out.write("\tid=\"playa\"\r\n");
      out.write("\tstyle=\"position:absolute\">\r\n");
      out.write("\t<param name=\"movie\" value=\"resources/playa2.swf\">\r\n");
      out.write("\t<param name=\"quality\" value=\"high\">\r\n");
      out.write("\t<param name=\"flashvars\" value=\"autoplay=false&playlist=resources/appelsap.xml\">\r\n");
      out.write("\t<param name=\"loop\" value=\"false\">\r\n");
      out.write("\t<param name=\"loopsong\" value=\"false\">\r\n");
      out.write("\t<embed\r\n");
      out.write("\t\tname=\"playa\"\r\n");
      out.write("\t\tsrc=\"resources/playa2.swf\"\r\n");
      out.write("\t\twidth=\"1\"\r\n");
      out.write("\t\theight=\"1\"\r\n");
      out.write("\t\tquality=\"high\"\r\n");
      out.write("\t\tswLiveConnect=\"true\"\r\n");
      out.write("\t\tflashvars=\"autoplay=false&playlist=resources/appelsap.xml\"\r\n");
      out.write("\t\tpluginspage=\"http://www.macromedia.com/go/flashplayer/\"\r\n");
      out.write("\t\tloop=\"false\" \r\n");
      out.write("\t\tstyle=\"position:absolute\">\r\n");
      out.write("\t</embed>\r\n");
      out.write("</object>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_ajax_005fAjaxDiv_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ajax:AjaxDiv
    com.cj.ajax.AjaxDivTag _jspx_th_ajax_005fAjaxDiv_005f0 = (com.cj.ajax.AjaxDivTag) _005fjspx_005ftagPool_005fajax_005fAjaxDiv_0026_005furl_005ftimeout_005fid_005fhandler.get(com.cj.ajax.AjaxDivTag.class);
    _jspx_th_ajax_005fAjaxDiv_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ajax_005fAjaxDiv_005f0.setParent(null);
    // /index.jsp(60,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ajax_005fAjaxDiv_005f0.setId("contactsscroll");
    // /index.jsp(60,4) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ajax_005fAjaxDiv_005f0.setUrl("contacts.cl");
    // /index.jsp(60,4) name = timeout type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ajax_005fAjaxDiv_005f0.setTimeout(8);
    // /index.jsp(60,4) name = handler type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ajax_005fAjaxDiv_005f0.setHandler("contactsHandler");
    int _jspx_eval_ajax_005fAjaxDiv_005f0 = _jspx_th_ajax_005fAjaxDiv_005f0.doStartTag();
    if (_jspx_eval_ajax_005fAjaxDiv_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ajax_005fAjaxDiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ajax_005fAjaxDiv_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ajax_005fAjaxDiv_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<br /><br /><br /><div align=\"center\"><img src=\"img/loading.gif\" width=\"32\" height=\"32\"></div>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_ajax_005fAjaxDiv_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ajax_005fAjaxDiv_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ajax_005fAjaxDiv_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fajax_005fAjaxDiv_0026_005furl_005ftimeout_005fid_005fhandler.reuse(_jspx_th_ajax_005fAjaxDiv_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fajax_005fAjaxDiv_0026_005furl_005ftimeout_005fid_005fhandler.reuse(_jspx_th_ajax_005fAjaxDiv_005f0);
    return false;
  }
}
