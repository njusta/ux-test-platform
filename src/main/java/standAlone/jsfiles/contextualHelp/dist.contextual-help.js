!function(e){function t(n){if(o[n])return o[n].exports;var r=o[n]={exports:{},id:n,loaded:!1};return e[n].call(r.exports,r,r.exports,t),r.loaded=!0,r.exports}var o={};return t.m=e,t.c=o,t.p="",t(0)}([function(e,t,o){e.exports=o(3)},function(e,t){e.exports=function(){var e=[];return e.toString=function(){for(var e=[],t=0;t<this.length;t++){var o=this[t];o[2]?e.push("@media "+o[2]+"{"+o[1]+"}"):e.push(o[1])}return e.join("")},e.i=function(t,o){"string"==typeof t&&(t=[[null,t,""]]);for(var n={},r=0;r<this.length;r++){var i=this[r][0];"number"==typeof i&&(n[i]=!0)}for(r=0;r<t.length;r++){var a=t[r];"number"==typeof a[0]&&n[a[0]]||(o&&!a[2]?a[2]=o:o&&(a[2]="("+a[2]+") and ("+o+")"),e.push(a))}},e}},function(e,t,o){function n(e,t){for(var o=0;o<e.length;o++){var n=e[o],r=d[n.id];if(r){r.refs++;for(var i=0;i<r.parts.length;i++)r.parts[i](n.parts[i]);for(;i<n.parts.length;i++)r.parts.push(c(n.parts[i],t))}else{for(var a=[],i=0;i<n.parts.length;i++)a.push(c(n.parts[i],t));d[n.id]={id:n.id,refs:1,parts:a}}}}function r(e){for(var t=[],o={},n=0;n<e.length;n++){var r=e[n],i=r[0],a=r[1],s=r[2],l=r[3],c={css:a,media:s,sourceMap:l};o[i]?o[i].parts.push(c):t.push(o[i]={id:i,parts:[c]})}return t}function i(e,t){var o=v(),n=b[b.length-1];if("top"===e.insertAt)n?n.nextSibling?o.insertBefore(t,n.nextSibling):o.appendChild(t):o.insertBefore(t,o.firstChild),b.push(t);else{if("bottom"!==e.insertAt)throw new Error("Invalid value for parameter 'insertAt'. Must be 'top' or 'bottom'.");o.appendChild(t)}}function a(e){e.parentNode.removeChild(e);var t=b.indexOf(e);t>=0&&b.splice(t,1)}function s(e){var t=document.createElement("style");return t.type="text/css",i(e,t),t}function l(e){var t=document.createElement("link");return t.rel="stylesheet",i(e,t),t}function c(e,t){var o,n,r;if(t.singleton){var i=x++;o=m||(m=s(t)),n=p.bind(null,o,i,!1),r=p.bind(null,o,i,!0)}else e.sourceMap&&"function"==typeof URL&&"function"==typeof URL.createObjectURL&&"function"==typeof URL.revokeObjectURL&&"function"==typeof Blob&&"function"==typeof btoa?(o=l(t),n=h.bind(null,o),r=function(){a(o),o.href&&URL.revokeObjectURL(o.href)}):(o=s(t),n=u.bind(null,o),r=function(){a(o)});return n(e),function(t){if(t){if(t.css===e.css&&t.media===e.media&&t.sourceMap===e.sourceMap)return;n(e=t)}else r()}}function p(e,t,o,n){var r=o?"":n.css;if(e.styleSheet)e.styleSheet.cssText=_(t,r);else{var i=document.createTextNode(r),a=e.childNodes;a[t]&&e.removeChild(a[t]),a.length?e.insertBefore(i,a[t]):e.appendChild(i)}}function u(e,t){var o=t.css,n=t.media;if(n&&e.setAttribute("media",n),e.styleSheet)e.styleSheet.cssText=o;else{for(;e.firstChild;)e.removeChild(e.firstChild);e.appendChild(document.createTextNode(o))}}function h(e,t){var o=t.css,n=t.sourceMap;n&&(o+="\n/*# sourceMappingURL=data:application/json;base64,"+btoa(unescape(encodeURIComponent(JSON.stringify(n))))+" */");var r=new Blob([o],{type:"text/css"}),i=e.href;e.href=URL.createObjectURL(r),i&&URL.revokeObjectURL(i)}var d={},f=function(e){var t;return function(){return"undefined"==typeof t&&(t=e.apply(this,arguments)),t}},g=f(function(){return/msie [6-9]\b/.test(self.navigator.userAgent.toLowerCase())}),v=f(function(){return document.head||document.getElementsByTagName("head")[0]}),m=null,x=0,b=[];e.exports=function(e,t){t=t||{},"undefined"==typeof t.singleton&&(t.singleton=g()),"undefined"==typeof t.insertAt&&(t.insertAt="bottom");var o=r(e);return n(o,t),function(e){for(var i=[],a=0;a<o.length;a++){var s=o[a],l=d[s.id];l.refs--,i.push(l)}if(e){var c=r(e);n(c,t)}for(var a=0;a<i.length;a++){var l=i[a];if(0===l.refs){for(var p=0;p<l.parts.length;p++)l.parts[p]();delete d[l.id]}}}};var _=function(){var e=[];return function(t,o){return e[t]=o,e.filter(Boolean).join("\n")}}()},function(e,t,o){"use strict";var n=o(17),r=o(4);o(15),document.addEventListener("mousedown",function(){document.body.classList.add("mouseDetected")},!1),document.addEventListener("keydown",function(){document.body.classList.remove("mouseDetected")},!1);var i=function(){document.removeEventListener("o.InitContextualHelp",i);var e=document.createElement("div");e.id="o-contextual-help-drawer",e.setAttribute("data-o-component","o-drawer"),e.classList.add("o-drawer-right","o-drawer-animated","o-contextual-help__drawer");var t=document.getElementsByTagName("body")[0],o=document.querySelector("header.o-app-header")||t.firstChild;t.insertBefore(e,o?o.nextSibling:o);var a=new n(e),s=new r(e);a.open=function(){s.open()},a.close=function(){s.close()},a.toggle=function(){s.toggle()},a._drawer=s};document.addEventListener("o.InitContextualHelp",i),n.init=i,e.exports=n},function(e,t,o){"use strict";o(16);var n=o(5),r=function(){n.init(),document.removeEventListener("o.InitAllDrawerElements",r)};document.addEventListener("o.InitAllDrawerElements",r),e.exports=n},function(e,t,o){"use strict";function n(e){if(!(this instanceof n))throw new TypeError("Constructor Drawer requires 'new'");if(!e)throw new TypeError("missing required argument: element");"string"==typeof e&&(e=document.querySelector(e)),this.target=e,this.currentTarget=!1,this.trigger,this.closeButton,this.target.style.display="none",this.target.classList.add("o-drawer"),this.trap=document.createElement("button"),this.trap.className="pe-trap",this.trap.textContent="close",this.trap.setAttribute("data-close","o-drawer"),this.trap.setAttribute("data-target",this.target.id),n.cache.set(e,this);var t=this.target.classList.contains("o-drawer-left")||this.target.classList.contains("o-drawer-right");if(t||this.target.classList.add("o-drawer-left"),!n.delegate){var o=new u(document.body);o.on("click",'[data-toggle="o-drawer"], [data-close="o-drawer"], [data-open="o-drawer"]',function(e,t){s(e,t,n)}),n.delegate=o}var r=this;return l(r),c(r),this}function r(e){return e||(e=document.body),e instanceof HTMLElement||(e=document.querySelectorAll(e)[0]),e.querySelectorAll('[data-o-component="o-drawer"]')}function i(e,t,o){e.classList.add("o-drawer-open"),t&&t.setAttribute("aria-expanded","true"),o&&o.focus()}function a(e,t){for(;(e=e.parentNode)&&e!==t;);return e}function s(e,t,o){e.preventDefault();for(var n=t.getAttribute("data-target")||t.getAttribute("href"),r=document.querySelectorAll(n),i=0,a=r.length;i<a;i++){var s=r[i],l=o.cache.get(s);if(l||"o-collapse"!==s.getAttribute("data-o-component")||(l=new o(s)),l){var c=p(t);l[c]()}}}function l(e){e.focusables=Array.prototype.slice.call(e.target.querySelectorAll('[tabindex="0"], a[href], button:not([disabled]), input:not([disabled]), select:not([disabled]), textarea:not([disabled])'));for(var t=0,o=e.focusables.length;t<o;t++){var n=e.focusables[t];if(n.hasAttribute("data-close")){e.closeButton=n;break}}e.focusables.length&&(e.firstFocusable=e.closeButton||e.focusables[0],e.target.appendChild(e.trap))}function c(e){document.addEventListener("o.Drawer.RightDrawer",function(){e.target.classList.contains("o-drawer-right")&&!e.currentTarget&&e.close(),e.currentTarget=!1}),document.addEventListener("o.Drawer.LeftDrawer",function(){e.target.classList.contains("o-drawer-left")&&!e.currentTarget&&e.close(),e.currentTarget=!1})}function p(e){if(e&&e.dataset)return Object.keys(e.dataset).filter(function(t){if("o-drawer"===e.dataset[t])return t})}var u=o(11),h=o(6),d=function(e,t,o){if(document.createEvent&&e.dispatchEvent){var n=document.createEvent("Event");n.initEvent(t,!0,!0),o&&(n.detail=o),e.dispatchEvent(n)}};n.cache=new h,n.init=function(e){for(var t=r(e),o=[],i=0,a=t.length;i<a;i++)o.push(new n(t[i]));return o},n.destroy=function(){n.bodyDelegate&&n.bodyDelegate.destroy()},n.prototype.open=function(){if(this.target.classList.contains("o-drawer-open"))return this;this.trigger=document.activeElement;var e=this.trigger,t=this.target,o=this.firstFocusable;return t.style.display="block",t.classList.contains("o-drawer-animated")?setTimeout(function(){i(t,e,o)},50):i(t,e,o),this.bound=this.trapFocus.bind(this),t.addEventListener("keydown",this.bound),this.currentTarget=!0,t.classList.contains("o-drawer-right")&&d(t,"o.Drawer.RightDrawer"),t.classList.contains("o-drawer-left")&&d(t,"o.Drawer.LeftDrawer"),d(t,"oDrawer.open"),this},n.prototype.close=function(){if(!this.target.classList.contains("o-drawer-open"))return this.trigger=document.activeElement,this;this.target.classList.remove("o-drawer-open"),d(this.target,"oDrawer.close"),this.trigger&&this.trigger.setAttribute("aria-expanded","false");var e=this.target,t=a(document.activeElement,e);return e.classList.contains("o-drawer-animated")?setTimeout(function(){e.style.display="none"},400):e.style.display="none",e.removeEventListener("keydown",this.bound),t&&this.trigger&&this.trigger.focus(),this},n.prototype.toggle=function(){var e=this.target.classList.contains("o-drawer-open");return e&&this.close()||this.open(),this},n.prototype.trapFocus=function(e){function t(){r===i&&(n.preventDefault(),a.focus())}function o(){r===a&&(n.preventDefault(),i.focus())}var n=e||event,r=document.activeElement,i=this.trap,a=this.firstFocusable,s=n.keyCode;switch(s){case 27:this.close();break;case 13:case 32:if(r===i){n.preventDefault(),this.close();break}case 9:if(1===this.focusables.length){n.preventDefault();break}return n.shiftKey?o():t()}},e.exports=n},function(e,t,o){"use strict";e.exports=o(7)},function(e,t){/**
	 * @license
	 * Copyright (c) 2014 The Polymer Project Authors. All rights reserved.
	 * This code may only be used under the BSD style license found at http://polymer.github.io/LICENSE.txt
	 * The complete set of authors may be found at http://polymer.github.io/AUTHORS.txt
	 * The complete set of contributors may be found at http://polymer.github.io/CONTRIBUTORS.txt
	 * Code distributed by Google as part of the polymer project is also
	 * subject to an additional IP rights grant found at http://polymer.github.io/PATENTS.txt
	 */
!function(t){var o=Object.defineProperty,n=Date.now()%1e9,r=function(){this.name="__st"+(1e9*Math.random()>>>0)+(n++ +"__")};r.prototype={set:function(e,t){var n=e[this.name];return n&&n[0]===e?n[1]=t:o(e,this.name,{value:[e,t],writable:!0}),this},get:function(e){var t;return(t=e[this.name])&&t[0]===e?t[1]:void 0},delete:function(e){var t=e[this.name];return!(!t||t[0]!==e)&&(t[0]=t[1]=void 0,!0)},has:function(e){var t=e[this.name];return!!t&&t[0]===e}},e.exports=(t||{}).WeakMap||r}(this||window)},function(e,t,o){t=e.exports=o(1)(),t.push([e.id,'.mouseDetected .o-drawer a,.mouseDetected .o-drawer button{outline:0}.o-contextual-help__topic-content,.o-contextual-help__topics{height:100%;width:100%;position:absolute;top:0;left:0;padding:30px;overflow-x:hidden;overflow-y:auto;box-sizing:border-box;transition:left .5s ease-in-out;border-top:1px solid #d9d9d9}.exists-o-header .o-contextual-help__topic-content,.exists-o-header .o-contextual-help__topics{top:70px;height:calc(100% - 70px)}@media (max-width:767px){.exists-o-header .o-contextual-help__topic-content,.exists-o-header .o-contextual-help__topics{top:60px;height:calc(100% - 60px)}}.o-contextual-help__topic-content{left:100%}.o-contextual-help__content--visible .o-contextual-help__topics{left:-100%}.o-contextual-help__content--visible .o-contextual-help__topics .topic_heading{margin-left:-30px}.o-contextual-help__content--visible .o-contextual-help__topic-content{left:0}.o-contextual-help__content--visible .o-contextual-help__topic-content .o-contextual-help__header .back-to-help{margin-left:0;margin-right:-90%;opacity:1}.o-contextual-help__header{padding-bottom:25px;margin-bottom:25px;border-bottom:1px solid #d9d9d9}.o-contextual-help__header:after{content:"";display:block;clear:both}.o-contextual-help__header .topic_heading{margin:0;transition:margin-left .3s ease-in-out .3s}.o-contextual-help__header .close-help{float:right}.o-contextual-help__header .back-to-help{margin-left:40%;padding:2px 2px 2px 0;opacity:0;transition:margin-left .3s ease-in-out .2s,opacity .3s .2s}.o-contextual-help__header .back-to-help svg{float:left}.o-contextual-help__header .back-to-help span{margin-left:5px;line-height:18px}.o-contextual-help__excerpt{margin-top:25px;cursor:pointer}.o-contextual-help__excerpt h3 a{color:#252525;text-decoration:none}.o-contextual-help__excerpt-list div:first-child .o-contextual-help__excerpt{margin:0}.o-contextual-help__excerpt p:after{content:"\\2026"}.o-contextual-help__excerpt-list div:last-child .o-contextual-help__excerpt p:last-child,.o-contextual-help__topic p:last-child{margin-bottom:0}.o-contextual-help__topic h2{margin-bottom:25px}.o-contextual-help__topic h3,.o-contextual-help__topic h4{margin:0;font-size:1rem;font-weight:600;line-height:1.28571rem}.o-contextual-help__topic p{margin-bottom:25px;color:#6a7070;font-size:1rem;line-height:1.28571rem}.o-contextual-help__topic ol,.o-contextual-help__topic ul{padding-left:2.5em}.o-contextual-help__topic li{color:#6a7070;margin-bottom:.6em}.o-contextual-help__topic .o-disclosure{margin-top:25px;padding:2px;color:#252525;background-color:transparent;border:0}.o-contextual-help__topic .o-disclosure svg{margin-right:3px}.o-contextual-help__topic .o-contextual-help__accordion h3:first-child button{margin-top:0}.o-contextual-help__topic .o-panel--closed{display:none}.o-contextual-help__topic .o-panel--opened{display:block}',""])},function(e,t,o){t=e.exports=o(1)(),t.push([e.id,".o-drawer{position:fixed;height:100%;width:320px;padding:30px;box-sizing:border-box;background-color:#fff;border:0 solid #d9d9d9;box-shadow:0 3px 5px 0 hsla(0,0%,78%,.7);overflow-x:hidden;overflow-y:auto;z-index:995}.o-drawer.o-drawer-animated{transition:left .5s ease-in-out,right .5s ease-in-out}.o-drawer.o-drawer-left,.o-drawer.o-drawer-right{top:0}.o-drawer.o-drawer-right{right:-320px;border-left-width:1px}.o-drawer.o-drawer-right.o-drawer-open{right:0}.o-drawer.o-drawer-left{left:-320px;border-right-width:1px}.o-drawer.o-drawer-left.o-drawer-open{left:0}.o-drawer .pe-trap{position:absolute;bottom:5px;right:30px;padding:5px;color:#047a9c;border:1px solid #047a9c;background-color:#fff;opacity:0}.o-drawer .pe-trap:focus{opacity:1}@media only screen and (max-width:319px){.o-drawer{width:100%;z-index:995}.o-drawer.o-drawer-right{right:-100%}.o-drawer.o-drawer-left{left:-100%}}",""])},function(e,t){"use strict";function o(e){this.listenerMap=[{},{}],e&&this.root(e),this.handle=o.prototype.handle.bind(this)}function n(e,t){return e.toLowerCase()===t.tagName.toLowerCase()}function r(e,t){return this.rootElement===window?t===document:this.rootElement===t}function i(e,t){return e===t.id}e.exports=o,o.prototype.root=function(e){var t,o=this.listenerMap;if(this.rootElement){for(t in o[1])o[1].hasOwnProperty(t)&&this.rootElement.removeEventListener(t,this.handle,!0);for(t in o[0])o[0].hasOwnProperty(t)&&this.rootElement.removeEventListener(t,this.handle,!1)}if(!e||!e.addEventListener)return this.rootElement&&delete this.rootElement,this;this.rootElement=e;for(t in o[1])o[1].hasOwnProperty(t)&&this.rootElement.addEventListener(t,this.handle,!0);for(t in o[0])o[0].hasOwnProperty(t)&&this.rootElement.addEventListener(t,this.handle,!1);return this},o.prototype.captureForType=function(e){return["blur","error","focus","load","resize","scroll"].indexOf(e)!==-1},o.prototype.on=function(e,t,o,s){var l,c,p,u;if(!e)throw new TypeError("Invalid event type: "+e);if("function"==typeof t&&(s=o,o=t,t=null),void 0===s&&(s=this.captureForType(e)),"function"!=typeof o)throw new TypeError("Handler must be a type of Function");return l=this.rootElement,c=this.listenerMap[s?1:0],c[e]||(l&&l.addEventListener(e,this.handle,s),c[e]=[]),t?/^[a-z]+$/i.test(t)?(u=t,p=n):/^#[a-z0-9\-_]+$/i.test(t)?(u=t.slice(1),p=i):(u=t,p=a):(u=null,p=r.bind(this)),c[e].push({selector:t,handler:o,matcher:p,matcherParam:u}),this},o.prototype.off=function(e,t,o,n){var r,i,a,s,l;if("function"==typeof t&&(n=o,o=t,t=null),void 0===n)return this.off(e,t,o,!0),this.off(e,t,o,!1),this;if(a=this.listenerMap[n?1:0],!e){for(l in a)a.hasOwnProperty(l)&&this.off(l,t,o);return this}if(s=a[e],!s||!s.length)return this;for(r=s.length-1;r>=0;r--)i=s[r],t&&t!==i.selector||o&&o!==i.handler||s.splice(r,1);return s.length||(delete a[e],this.rootElement&&this.rootElement.removeEventListener(e,this.handle,n)),this},o.prototype.handle=function(e){var t,o,n,r,i,a,s,l=e.type,c=[],p="ftLabsDelegateIgnore";if(e[p]!==!0){switch(s=e.target,3===s.nodeType&&(s=s.parentNode),n=this.rootElement,r=e.eventPhase||(e.target!==e.currentTarget?3:2)){case 1:c=this.listenerMap[1][l];break;case 2:this.listenerMap[0]&&this.listenerMap[0][l]&&(c=c.concat(this.listenerMap[0][l])),this.listenerMap[1]&&this.listenerMap[1][l]&&(c=c.concat(this.listenerMap[1][l]));break;case 3:c=this.listenerMap[0][l]}for(o=c.length;s&&o;){for(t=0;t<o&&(i=c[t],i);t++)if(i.matcher.call(s,i.matcherParam,s)&&(a=this.fire(e,s,i)),a===!1)return e[p]=!0,void e.preventDefault();if(s===n)break;o=c.length,s=s.parentElement}}},o.prototype.fire=function(e,t,o){return o.handler.call(t,e,t)};var a=function(e){if(e){var t=e.prototype;return t.matches||t.matchesSelector||t.webkitMatchesSelector||t.mozMatchesSelector||t.msMatchesSelector||t.oMatchesSelector}}(Element);o.prototype.destroy=function(){this.off(),this.root()}},function(e,t,o){"use strict";/**
	 * @preserve Create and manage a DOM event delegator.
	 *
	 * @version 0.3.0
	 * @codingstandard ftlabs-jsv2
	 * @copyright The Financial Times Limited [All Rights Reserved]
	 * @license MIT License (see LICENSE.txt)
	 */
var n=o(10);e.exports=function(e){return new n(e)},e.exports.Delegate=n},function(e,t){e.exports="<h2 class=pe-title></h2> <div></div> "},function(e,t){e.exports='<div class="o-contextual-help__topic o-contextual-help__excerpt"> <h3 class="pe-label pe-bold"> <a href=#></a> </h3> <p></p> </div> '},function(e,t){e.exports='<div class=o-contextual-help__topics> <div class=o-contextual-help__header> <button type=button data-target=#o-contextual-help-drawer data-close=o-drawer class="pe-icon--btn close-help" aria-label="Close help"> <svg role=img focusable=false aria-labelledby=close_main class=pe-icon--remove-sm-24> <title id=close_main>Close Help</title> <use xlink:href=#remove-sm-24></use> </svg> </button> <h2 class="topic_heading pe-title">Help Topics</h2> </div> <div class=o-contextual-help__excerpt-list aria-live=polite></div> </div> <div class=o-contextual-help__topic-content> <div class=o-contextual-help__header> <button type=button data-target=#o-contextual-help-drawer data-close=o-drawer class="pe-icon--btn close-help" aria-label="Close help"> <svg role=img aria-labelledby=close_sub focusable=false class=pe-icon--remove-sm-24> <title id=close_sub>Close Help</title> <use xlink:href=#remove-sm-24></use> </svg> </button> <button type=button class="pe-icon--btn back-to-help" id=contextual-help-close-content> <svg aria-hidden=true focusable=false class=pe-icon--chevron-back-18> <use xlink:href=#chevron-back-18></use> </svg> <span>Back to Help Topics</span> </button> </div> <div id=o-contextual-help-topic-content-target class=o-contextual-help__topic aria-live=polite></div> </div> '},function(e,t,o){var n=o(8);"string"==typeof n&&(n=[[e.id,n,""]]);o(2)(n,{});n.locals&&(e.exports=n.locals)},function(e,t,o){var n=o(9);"string"==typeof n&&(n=[[e.id,n,""]]);o(2)(n,{});n.locals&&(e.exports=n.locals)},function(e,t,o){"use strict";function n(e){function t(){var e={},t=document.querySelector("[data-o-contextual-help-config]");if(!t)return e;try{e=JSON.parse(t.textContent)}catch(t){throw e={},new Error("Unable to parse configuration object: invalid JSON")}return e}var o=this,n="https://raw.githubusercontent.com/Pearson-Higher-Ed/help-content/master/out/";this.fetchHelpContent=function(e,t){return t=t||function(){},""===e.replace(/\s/,"")&&t("no content ID issued"),o.cache&&o.cache[e]?void t(null,o.cache[e]):void r({url:n+o.lang+"/"+e+".json",onSuccess:function(n){var r=JSON.parse(n.responseText);o.cache[e]=r,t(null,r)},onError:function(i){if(o.lang!==o.defaultLang){var a=o.defaultLang;r({url:n+"/"+a+"/"+e+".json",onSuccess:function(n){var r=JSON.parse(n.responseText);o.cache[e]=r,t(null,r)},onError:function(e){t(e)}})}else t(i)}})},this.defaultLang="en-us",this.lang=this.defaultLang,e instanceof String&&(e=document.querySelector("#"+e)),this._el=e,this.cache={},this.topics=[],e.nodeType&&(e.innerHTML=i),this._inner_trigger=null,e.querySelector(".o-contextual-help__topic-content").style.visibility="hidden",e.querySelector("#contextual-help-close-content").onclick=function(){o.manageLayers(!1)};var s=t();s&&s.helpTopics&&s.helpTopics.length>0&&(this.topics=s.helpTopics),this.populateFromList=function(e,t){if(t=t||function(){},e.length>0){var n=e.splice(0,1)[0];o.fetchHelpContent(n,function(r,i){i&&!r||e.length>0&&o.populateFromList(e,t);var s=document.createElement("div");s.innerHTML=a;var l=s.querySelector("h3 a"),c=s.querySelector("p");l.innerHTML=i.title,c.innerHTML=i.excerpt,s.onclick=function(){o._inner_trigger=l,o.openHelpTopic(n)},o._el.querySelector(".o-contextual-help__excerpt-list").appendChild(s),e.length>0?o.populateFromList(e,t):t()})}else t()},this._initRunning=!1,this._rerunInit=!1,this.init=function(){this._initRunning=!0,this._el.querySelector(".o-contextual-help__excerpt-list").innerHTML="";var e=this.deDupeTopics();this.populateFromList(e,function(){o._initRunning=!1,o._rerunInit&&(o._rerunInit=!1,o.init())})};var l=document.querySelector("header.o-app-header");return l&&(l.addEventListener("oAppHeader.help.toggle",function(){o.toggle&&o.toggle()}),e.classList.add("exists-o-header")),this.scheduleInit(),this._el.oContextualHelp=this,this}var r=o(18),i=o(14),a=o(13),s=o(12);n.prototype.scheduleInit=function(){this._initRunning?this._rerunInit=!0:this.init()},n.prototype.deDupeTopics=function(){var e=this.topics,t=e.filter(function(t,o){return e.indexOf(t)==o});return t},n.prototype.setLanguage=function(e){this.lang=e},n.prototype.manageLayers=function(e){var t=this._el,o=this,n=t.querySelector(".o-contextual-help__topics"),r=t.querySelector(".o-contextual-help__topic-content"),i=n.querySelector(".close-help"),a=r.querySelector(".close-help"),s=r.querySelector("#contextual-help-close-content");e?(r.style.visibility="visible",this._drawer.firstFocusable=a,t.classList.add("o-contextual-help__content--visible"),setTimeout(function(){n.style.visibility="hidden",s.focus()},450)):(n.style.visibility="visible",this._drawer.firstFocusable=i,t.classList.remove("o-contextual-help__content--visible"),setTimeout(function(){r.style.visibility="hidden",null!==o._inner_trigger?(o._inner_trigger.focus(),o._inner_trigger=null):i.focus()},450))},n.prototype.accordion=function(){for(var e=this._el.querySelector(".o-contextual-help__accordion"),t=e.querySelectorAll(".o-disclosure"),o=0,n=t.length;o<n;o++){var r=t[o];r.onclick=function(e){var t=document.getElementById(this.getAttribute("aria-controls")),o=this.getElementsByTagNameNS("http://www.w3.org/2000/svg","svg")[0],n=o.getElementsByTagName("use")[0];"true"==this.getAttribute("aria-expanded")?(t.className="o-panel--closed",o.setAttribute("class","pe-icon--pivot-close-18"),n.href.baseVal="#pivot-close-18",this.setAttribute("aria-expanded",!1)):(t.className="o-panel--open",o.setAttribute("class","pe-icon--pivot-open-18"),n.href.baseVal="#pivot-open-18",this.setAttribute("aria-expanded",!0))}}},n.prototype.openHelpTopic=function(e){var t=this._el.querySelector("#o-contextual-help-topic-content-target"),o=this._el;e||(t.innerHTML=""),e&&(this.fetchHelpContent(e,function(e,o){if(e)throw e;if(o){t.innerHTML=s,t.querySelector("h2").innerHTML=o.title;var n=t.querySelector("div");n.innerHTML=o.content}}),t.querySelector(".o-contextual-help__accordion")&&this.accordion()),this.manageLayers(!0),o.classList.contains("o-drawer-open")||this.open()},n.prototype.addTopics=function(e){"string"==typeof e&&(e=[e]);for(var t=0,o=e.length;t<o;t++){var n=e[t];this.topics.indexOf(n)<0&&this.topics.push(n)}this.scheduleInit()},n.prototype.removeTopics=function(e){"string"==typeof e&&(e=[e]);for(var t=0,o=e.length;t<o;t++){var n=e[t];this.topics.indexOf(n)>=0&&this.topics.splice(this.topics.indexOf(n),1)}this.scheduleInit()},n.prototype.removeAllTopics=function(){this.topics.splice(0,this.topics.length),this.scheduleInit()},n.prototype.getTopics=function(){return this.topics},e.exports=n},function(e,t){"use strict";function o(e){function t(){4===o.readyState&&(r(o.status)?e.onSuccess(o):e.onError(o))}if(0===arguments.length)throw new TypeError("Expected 1 argument, got 0");if("string"==typeof e&&(e={url:e}),!e.url)throw new TypeError("The 'url' option is required");e.method=e.method||"GET",e.onSuccess=e.onSuccess||n,e.onError=e.onError||n,e.headers=e.headers||{},e.data=e.data||"";var o=e.xhr||new XMLHttpRequest;o.open(e.method,e.url,!0),o.onreadystatechange=t;for(var i in e.headers)if(e.headers.hasOwnProperty(i)){var a=e.headers[i];o.setRequestHeader(i,a)}return o.send(e.data),o}function n(){}function r(e){return e>=200&&e<=299}e.exports=o}]);