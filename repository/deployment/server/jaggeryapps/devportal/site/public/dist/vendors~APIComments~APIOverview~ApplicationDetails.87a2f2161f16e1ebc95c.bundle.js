(this.webpackJsonp=this.webpackJsonp||[]).push([[0],{1340:function(t,e,n){"use strict";var r=n(6),i=n(76),a=n(159),o=n(2),s=n(1060),c=n(1061),u=n(1070),l=n(3980),d=n(3955),f=n(3956),h=n(338),p=n(1630),m={enter:h.b.enteringScreen,exit:h.b.leavingScreen},v=o.forwardRef((function(t,e){var n=t.BackdropProps,a=t.children,c=t.classes,h=t.className,v=t.disableBackdropClick,b=void 0!==v&&v,g=t.disableEscapeKeyDown,$=void 0!==g&&g,y=t.fullScreen,x=void 0!==y&&y,M=t.fullWidth,w=void 0!==M&&M,S=t.maxWidth,O=void 0===S?"sm":S,D=t.onBackdropClick,k=t.onClose,j=t.onEnter,W=t.onEntered,E=t.onEntering,T=t.onEscapeKeyDown,C=t.onExit,B=t.onExited,N=t.onExiting,_=t.open,Y=t.PaperComponent,H=void 0===Y?p.a:Y,P=t.PaperProps,A=void 0===P?{}:P,L=t.scroll,F=void 0===L?"paper":L,I=t.TransitionComponent,R=void 0===I?f.a:I,J=t.transitionDuration,K=void 0===J?m:J,U=t.TransitionProps,Z=t["aria-describedby"],z=t["aria-labelledby"],V=Object(i.a)(t,["BackdropProps","children","classes","className","disableBackdropClick","disableEscapeKeyDown","fullScreen","fullWidth","maxWidth","onBackdropClick","onClose","onEnter","onEntered","onEntering","onEscapeKeyDown","onExit","onExited","onExiting","open","PaperComponent","PaperProps","scroll","TransitionComponent","transitionDuration","TransitionProps","aria-describedby","aria-labelledby"]),X=o.useRef();return o.createElement(l.a,Object(r.a)({className:Object(s.default)(c.root,h),BackdropComponent:d.a,BackdropProps:Object(r.a)({transitionDuration:K},n),closeAfterTransition:!0},b?{disableBackdropClick:b}:{},{disableEscapeKeyDown:$,onEscapeKeyDown:T,onClose:k,open:_,ref:e},V),o.createElement(R,Object(r.a)({appear:!0,in:_,timeout:K,onEnter:j,onEntering:E,onEntered:W,onExit:C,onExiting:N,onExited:B,role:"none presentation"},U),o.createElement("div",{className:Object(s.default)(c.container,c["scroll".concat(Object(u.a)(F))]),onMouseUp:function(t){t.target===t.currentTarget&&t.target===X.current&&(X.current=null,D&&D(t),!b&&k&&k(t,"backdropClick"))},onMouseDown:function(t){X.current=t.target}},o.createElement(H,Object(r.a)({elevation:24,role:"dialog","aria-describedby":Z,"aria-labelledby":z},A,{className:Object(s.default)(c.paper,c["paperScroll".concat(Object(u.a)(F))],c["paperWidth".concat(Object(u.a)(String(O)))],A.className,x&&c.paperFullScreen,w&&c.paperFullWidth)}),a))))}));e.a=Object(c.a)((function(t){return{root:{"@media print":{position:"absolute !important"}},scrollPaper:{display:"flex",justifyContent:"center",alignItems:"center"},scrollBody:{overflowY:"auto",overflowX:"hidden",textAlign:"center","&:after":{content:'""',display:"inline-block",verticalAlign:"middle",height:"100%",width:"0"}},container:{height:"100%","@media print":{height:"auto"},outline:0},paper:{margin:32,position:"relative",overflowY:"auto","@media print":{overflowY:"visible",boxShadow:"none"}},paperScrollPaper:{display:"flex",flexDirection:"column",maxHeight:"calc(100% - 64px)"},paperScrollBody:{display:"inline-block",verticalAlign:"middle",textAlign:"left"},paperWidthFalse:{maxWidth:"calc(100% - 64px)"},paperWidthXs:{maxWidth:Math.max(t.breakpoints.values.xs,444),"&$paperScrollBody":Object(a.a)({},t.breakpoints.down(Math.max(t.breakpoints.values.xs,444)+64),{maxWidth:"calc(100% - 64px)"})},paperWidthSm:{maxWidth:t.breakpoints.values.sm,"&$paperScrollBody":Object(a.a)({},t.breakpoints.down(t.breakpoints.values.sm+64),{maxWidth:"calc(100% - 64px)"})},paperWidthMd:{maxWidth:t.breakpoints.values.md,"&$paperScrollBody":Object(a.a)({},t.breakpoints.down(t.breakpoints.values.md+64),{maxWidth:"calc(100% - 64px)"})},paperWidthLg:{maxWidth:t.breakpoints.values.lg,"&$paperScrollBody":Object(a.a)({},t.breakpoints.down(t.breakpoints.values.lg+64),{maxWidth:"calc(100% - 64px)"})},paperWidthXl:{maxWidth:t.breakpoints.values.xl,"&$paperScrollBody":Object(a.a)({},t.breakpoints.down(t.breakpoints.values.xl+64),{maxWidth:"calc(100% - 64px)"})},paperFullWidth:{width:"calc(100% - 64px)"},paperFullScreen:{margin:0,width:"100%",maxWidth:"100%",height:"100%",maxHeight:"none",borderRadius:0,"&$paperScrollBody":{margin:0,maxWidth:"100%"}}}}),{name:"MuiDialog"})(v)},1448:function(t,e,n){"use strict";var r=n(6),i=n(76),a=n(2),o=n(1060),s=n(1061),c=n(1619),u=a.forwardRef((function(t,e){var n=t.children,s=t.classes,u=t.className,l=t.disableTypography,d=void 0!==l&&l,f=Object(i.a)(t,["children","classes","className","disableTypography"]);return a.createElement("div",Object(r.a)({className:Object(o.default)(s.root,u),ref:e},f),d?n:a.createElement(c.a,{component:"h2",variant:"h6"},n))}));e.a=Object(s.a)({root:{margin:0,padding:"16px 24px",flex:"0 0 auto"}},{name:"MuiDialogTitle"})(u)},1449:function(t,e,n){"use strict";var r=n(6),i=n(76),a=n(2),o=n(1060),s=n(1061),c=a.forwardRef((function(t,e){var n=t.classes,s=t.className,c=t.dividers,u=void 0!==c&&c,l=Object(i.a)(t,["classes","className","dividers"]);return a.createElement("div",Object(r.a)({className:Object(o.default)(n.root,s,u&&n.dividers),ref:e},l))}));e.a=Object(s.a)((function(t){return{root:{flex:"1 1 auto",WebkitOverflowScrolling:"touch",overflowY:"auto",padding:"8px 24px","&:first-child":{paddingTop:20}},dividers:{padding:"16px 24px",borderTop:"1px solid ".concat(t.palette.divider),borderBottom:"1px solid ".concat(t.palette.divider)}}}),{name:"MuiDialogContent"})(c)},1450:function(t,e,n){"use strict";var r=n(6),i=n(2),a=n(1061),o=n(1619),s=i.forwardRef((function(t,e){return i.createElement(o.a,Object(r.a)({component:"p",variant:"body1",color:"textSecondary",ref:e},t))}));e.a=Object(a.a)({root:{marginBottom:12}},{name:"MuiDialogContentText"})(s)},1451:function(t,e,n){"use strict";var r=n(6),i=n(76),a=n(2),o=n(1060),s=n(1061),c=a.forwardRef((function(t,e){var n=t.disableSpacing,s=void 0!==n&&n,c=t.classes,u=t.className,l=Object(i.a)(t,["disableSpacing","classes","className"]);return a.createElement("div",Object(r.a)({className:Object(o.default)(c.root,u,!s&&c.spacing),ref:e},l))}));e.a=Object(s.a)({root:{display:"flex",alignItems:"center",padding:8,justifyContent:"flex-end",flex:"0 0 auto"},spacing:{"& > :not(:first-child)":{marginLeft:8}}},{name:"MuiDialogActions"})(c)},1707:function(t,e,n){t.exports=function(){"use strict";var t=6e4,e=36e5,n="millisecond",r="second",i="minute",a="hour",o="day",s="week",c="month",u="quarter",l="year",d="date",f="Invalid Date",h=/^(\d{4})[-/]?(\d{1,2})?[-/]?(\d{0,2})[Tt\s]*(\d{1,2})?:?(\d{1,2})?:?(\d{1,2})?[.:]?(\d+)?$/,p=/\[([^\]]+)]|Y{1,4}|M{1,4}|D{1,2}|d{1,4}|H{1,2}|h{1,2}|a|A|m{1,2}|s{1,2}|Z{1,2}|SSS/g,m={name:"en",weekdays:"Sunday_Monday_Tuesday_Wednesday_Thursday_Friday_Saturday".split("_"),months:"January_February_March_April_May_June_July_August_September_October_November_December".split("_")},v=function(t,e,n){var r=String(t);return!r||r.length>=e?t:""+Array(e+1-r.length).join(n)+t},b={s:v,z:function(t){var e=-t.utcOffset(),n=Math.abs(e),r=Math.floor(n/60),i=n%60;return(e<=0?"+":"-")+v(r,2,"0")+":"+v(i,2,"0")},m:function t(e,n){if(e.date()<n.date())return-t(n,e);var r=12*(n.year()-e.year())+(n.month()-e.month()),i=e.clone().add(r,c),a=n-i<0,o=e.clone().add(r+(a?-1:1),c);return+(-(r+(n-i)/(a?i-o:o-i))||0)},a:function(t){return t<0?Math.ceil(t)||0:Math.floor(t)},p:function(t){return{M:c,y:l,w:s,d:o,D:d,h:a,m:i,s:r,ms:n,Q:u}[t]||String(t||"").toLowerCase().replace(/s$/,"")},u:function(t){return void 0===t}},g="en",$={};$[g]=m;var y=function(t){return t instanceof S},x=function(t,e,n){var r;if(!t)return g;if("string"==typeof t)$[t]&&(r=t),e&&($[t]=e,r=t);else{var i=t.name;$[i]=t,r=i}return!n&&r&&(g=r),r||!n&&g},M=function(t,e){if(y(t))return t.clone();var n="object"==typeof e?e:{};return n.date=t,n.args=arguments,new S(n)},w=b;w.l=x,w.i=y,w.w=function(t,e){return M(t,{locale:e.$L,utc:e.$u,x:e.$x,$offset:e.$offset})};var S=function(){function m(t){this.$L=x(t.locale,null,!0),this.parse(t)}var v=m.prototype;return v.parse=function(t){this.$d=function(t){var e=t.date,n=t.utc;if(null===e)return new Date(NaN);if(w.u(e))return new Date;if(e instanceof Date)return new Date(e);if("string"==typeof e&&!/Z$/i.test(e)){var r=e.match(h);if(r){var i=r[2]-1||0,a=(r[7]||"0").substring(0,3);return n?new Date(Date.UTC(r[1],i,r[3]||1,r[4]||0,r[5]||0,r[6]||0,a)):new Date(r[1],i,r[3]||1,r[4]||0,r[5]||0,r[6]||0,a)}}return new Date(e)}(t),this.$x=t.x||{},this.init()},v.init=function(){var t=this.$d;this.$y=t.getFullYear(),this.$M=t.getMonth(),this.$D=t.getDate(),this.$W=t.getDay(),this.$H=t.getHours(),this.$m=t.getMinutes(),this.$s=t.getSeconds(),this.$ms=t.getMilliseconds()},v.$utils=function(){return w},v.isValid=function(){return!(this.$d.toString()===f)},v.isSame=function(t,e){var n=M(t);return this.startOf(e)<=n&&n<=this.endOf(e)},v.isAfter=function(t,e){return M(t)<this.startOf(e)},v.isBefore=function(t,e){return this.endOf(e)<M(t)},v.$g=function(t,e,n){return w.u(t)?this[e]:this.set(n,t)},v.unix=function(){return Math.floor(this.valueOf()/1e3)},v.valueOf=function(){return this.$d.getTime()},v.startOf=function(t,e){var n=this,u=!!w.u(e)||e,f=w.p(t),h=function(t,e){var r=w.w(n.$u?Date.UTC(n.$y,e,t):new Date(n.$y,e,t),n);return u?r:r.endOf(o)},p=function(t,e){return w.w(n.toDate()[t].apply(n.toDate("s"),(u?[0,0,0,0]:[23,59,59,999]).slice(e)),n)},m=this.$W,v=this.$M,b=this.$D,g="set"+(this.$u?"UTC":"");switch(f){case l:return u?h(1,0):h(31,11);case c:return u?h(1,v):h(0,v+1);case s:var $=this.$locale().weekStart||0,y=(m<$?m+7:m)-$;return h(u?b-y:b+(6-y),v);case o:case d:return p(g+"Hours",0);case a:return p(g+"Minutes",1);case i:return p(g+"Seconds",2);case r:return p(g+"Milliseconds",3);default:return this.clone()}},v.endOf=function(t){return this.startOf(t,!1)},v.$set=function(t,e){var s,u=w.p(t),f="set"+(this.$u?"UTC":""),h=(s={},s[o]=f+"Date",s[d]=f+"Date",s[c]=f+"Month",s[l]=f+"FullYear",s[a]=f+"Hours",s[i]=f+"Minutes",s[r]=f+"Seconds",s[n]=f+"Milliseconds",s)[u],p=u===o?this.$D+(e-this.$W):e;if(u===c||u===l){var m=this.clone().set(d,1);m.$d[h](p),m.init(),this.$d=m.set(d,Math.min(this.$D,m.daysInMonth())).$d}else h&&this.$d[h](p);return this.init(),this},v.set=function(t,e){return this.clone().$set(t,e)},v.get=function(t){return this[w.p(t)]()},v.add=function(n,u){var d,f=this;n=Number(n);var h=w.p(u),p=function(t){var e=M(f);return w.w(e.date(e.date()+Math.round(t*n)),f)};if(h===c)return this.set(c,this.$M+n);if(h===l)return this.set(l,this.$y+n);if(h===o)return p(1);if(h===s)return p(7);var m=(d={},d[i]=t,d[a]=e,d[r]=1e3,d)[h]||1,v=this.$d.getTime()+n*m;return w.w(v,this)},v.subtract=function(t,e){return this.add(-1*t,e)},v.format=function(t){var e=this,n=this.$locale();if(!this.isValid())return n.invalidDate||f;var r=t||"YYYY-MM-DDTHH:mm:ssZ",i=w.z(this),a=this.$H,o=this.$m,s=this.$M,c=n.weekdays,u=n.months,l=function(t,n,i,a){return t&&(t[n]||t(e,r))||i[n].substr(0,a)},d=function(t){return w.s(a%12||12,t,"0")},h=n.meridiem||function(t,e,n){var r=t<12?"AM":"PM";return n?r.toLowerCase():r},m={YY:String(this.$y).slice(-2),YYYY:this.$y,M:s+1,MM:w.s(s+1,2,"0"),MMM:l(n.monthsShort,s,u,3),MMMM:l(u,s),D:this.$D,DD:w.s(this.$D,2,"0"),d:String(this.$W),dd:l(n.weekdaysMin,this.$W,c,2),ddd:l(n.weekdaysShort,this.$W,c,3),dddd:c[this.$W],H:String(a),HH:w.s(a,2,"0"),h:d(1),hh:d(2),a:h(a,o,!0),A:h(a,o,!1),m:String(o),mm:w.s(o,2,"0"),s:String(this.$s),ss:w.s(this.$s,2,"0"),SSS:w.s(this.$ms,3,"0"),Z:i};return r.replace(p,(function(t,e){return e||m[t]||i.replace(":","")}))},v.utcOffset=function(){return 15*-Math.round(this.$d.getTimezoneOffset()/15)},v.diff=function(n,d,f){var h,p=w.p(d),m=M(n),v=(m.utcOffset()-this.utcOffset())*t,b=this-m,g=w.m(this,m);return g=(h={},h[l]=g/12,h[c]=g,h[u]=g/3,h[s]=(b-v)/6048e5,h[o]=(b-v)/864e5,h[a]=b/e,h[i]=b/t,h[r]=b/1e3,h)[p]||b,f?g:w.a(g)},v.daysInMonth=function(){return this.endOf(c).$D},v.$locale=function(){return $[this.$L]},v.locale=function(t,e){if(!t)return this.$L;var n=this.clone(),r=x(t,e,!0);return r&&(n.$L=r),n},v.clone=function(){return w.w(this.$d,this)},v.toDate=function(){return new Date(this.valueOf())},v.toJSON=function(){return this.isValid()?this.toISOString():null},v.toISOString=function(){return this.$d.toISOString()},v.toString=function(){return this.$d.toUTCString()},m}(),O=S.prototype;return M.prototype=O,[["$ms",n],["$s",r],["$m",i],["$H",a],["$W",o],["$M",c],["$y",l],["$D",d]].forEach((function(t){O[t[1]]=function(e){return this.$g(e,t[0],t[1])}})),M.extend=function(t,e){return t.$i||(t(e,S,M),t.$i=!0),M},M.locale=x,M.isDayjs=y,M.unix=function(t){return M(1e3*t)},M.en=$[g],M.Ls=$,M.p={},M}()},1708:function(t,e,n){t.exports=function(){"use strict";return function(t,e,n){t=t||{};var r=e.prototype,i={future:"in %s",past:"%s ago",s:"a few seconds",m:"a minute",mm:"%d minutes",h:"an hour",hh:"%d hours",d:"a day",dd:"%d days",M:"a month",MM:"%d months",y:"a year",yy:"%d years"};function a(t,e,n,i){return r.fromToBase(t,e,n,i)}n.en.relativeTime=i,r.fromToBase=function(e,r,a,o,s){for(var c,u,l,d=a.$locale().relativeTime||i,f=t.thresholds||[{l:"s",r:44,d:"second"},{l:"m",r:89},{l:"mm",r:44,d:"minute"},{l:"h",r:89},{l:"hh",r:21,d:"hour"},{l:"d",r:35},{l:"dd",r:25,d:"day"},{l:"M",r:45},{l:"MM",r:10,d:"month"},{l:"y",r:17},{l:"yy",d:"year"}],h=f.length,p=0;p<h;p+=1){var m=f[p];m.d&&(c=o?n(e).diff(a,m.d,!0):a.diff(e,m.d,!0));var v=(t.rounding||Math.round)(Math.abs(c));if(l=c>0,v<=m.r||!m.r){v<=1&&p>0&&(m=f[p-1]);var b=d[m.l];s&&(v=s(""+v)),u="string"==typeof b?b.replace("%d",v):b(v,r,m.l,l);break}}if(r)return u;var g=l?d.future:d.past;return"function"==typeof g?g(u):g.replace("%s",u)},r.to=function(t,e){return a(t,e,this,!0)},r.from=function(t,e){return a(t,e,this)};var o=function(t){return t.$u?n.utc():n()};r.toNow=function(t){return this.to(o(this),t)},r.fromNow=function(t){return this.from(o(this),t)}}}()}}]);
//# sourceMappingURL=vendors~APIComments~APIOverview~ApplicationDetails.87a2f2161f16e1ebc95c.bundle.js.map