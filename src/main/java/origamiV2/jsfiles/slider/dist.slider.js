!function(e,t){if("object"==typeof exports&&"object"==typeof module)module.exports=t(require("react"),require("react-dom"));else if("function"==typeof define&&define.amd)define(["react","react-dom"],t);else{var n="object"==typeof exports?t(require("react"),require("react-dom")):t(e.React,e.ReactDOM);for(var r in n)("object"==typeof exports?exports:e)[r]=n[r]}}(this,function(e,t){return function(e){function t(r){if(n[r])return n[r].exports;var o=n[r]={exports:{},id:r,loaded:!1};return e[r].call(o.exports,o,o.exports,t),o.loaded=!0,o.exports}var n={};return t.m=e,t.c=n,t.p="",t(0)}([function(e,t,n){e.exports=n(2)},function(t,n){t.exports=e},function(e,t,n){"use strict";function r(e){return e&&e.__esModule?e:{"default":e}}function o(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}Object.defineProperty(t,"__esModule",{value:!0});var a=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}();n(7),n(9);var i=n(1),u=r(i),s=n(10),p=r(s),c=n(4),f=r(c),l=function(){function e(t){o(this,e),this.init(t)}return a(e,[{key:"init",value:function(e){p["default"].render(u["default"].createElement(f["default"],{data:e}),document.getElementById(e.elementId))}}]),e}();t["default"]=l,document.body.addEventListener("o.InitMySliderComponent",function(e){return new l(e.detail)})},function(e,t){"use strict";e.exports=function(){var e=[];return e.toString=function(){for(var e=[],t=0;t<this.length;t++){var n=this[t];n[2]?e.push("@media "+n[2]+"{"+n[1]+"}"):e.push(n[1])}return e.join("")},e.i=function(t,n){"string"==typeof t&&(t=[[null,t,""]]);for(var r={},o=0;o<this.length;o++){var a=this[o][0];"number"==typeof a&&(r[a]=!0)}for(o=0;o<t.length;o++){var i=t[o];"number"==typeof i[0]&&r[i[0]]||(n&&!i[2]?i[2]=n:n&&(i[2]="("+i[2]+") and ("+n+")"),e.push(i))}},e}},function(e,t,n){"use strict";function r(e){return e&&e.__esModule?e:{"default":e}}function o(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function a(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function i(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}Object.defineProperty(t,"__esModule",{value:!0});var u=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),s=n(1),p=r(s),c=n(5),f=r(c),l=navigator.userAgent.indexOf("Trident")!==-1&&navigator.userAgent.indexOf("MSIE")===-1,d=function(e){function t(){o(this,t);var e=a(this,(t.__proto__||Object.getPrototypeOf(t)).call(this));return e.state={value:"50"},e}return i(t,e),u(t,[{key:"updateSliderValue",value:function(e){this.setState({value:e.target.value})}},{key:"render",value:function(){var e=this;return p["default"].createElement("span",null,p["default"].createElement("label",{htmlFor:"numInput"}),p["default"].createElement("br",null),p["default"].createElement("br",null),p["default"].createElement(f["default"],{type:"range",id:"numInput",min:"0",max:"100",value:this.state.value,"aria-valuemin":"0","aria-valuemax":"100","aria-valuenow":this.state.value,onInput:function(t){return e.updateSliderValue(t)},onChange:function(t){l&&e.updateSliderValue(t)}}))}}]),t}(p["default"].Component);t["default"]=d},function(e,t,n){"use strict";var r=n(1),o=Object.assign||function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var r in n)Object.prototype.hasOwnProperty.call(n,r)&&(e[r]=n[r])}return e},a=r.createClass({displayName:"Range",propTypes:{onChange:r.PropTypes.func,onClick:r.PropTypes.func,onKeyDown:r.PropTypes.func,onMouseMove:r.PropTypes.func},getDefaultProps:function(){return{type:"range",onChange:function(){},onClick:function(){},onKeyDown:function(){},onMouseMove:function(){}}},onRangeChange:function(e){this.props.onMouseMove(e),1!==e.buttons&&1!==e.which||this.props.onChange(e)},onRangeClick:function(e){this.props.onClick(e),this.props.onChange(e)},onRangeKeyDown:function(e){this.props.onKeyDown(e),this.props.onChange(e)},setRangeRef:function(e){this.range=e},componentWillReceiveProps:function(e){this.range.value=e.value},render:function(){var e=o({},this.props,{defaultValue:this.props.value,onClick:this.onRangeClick,onKeyDown:this.onRangeKeyDown,onMouseMove:this.onRangeChange,onChange:function(){},ref:this.setRangeRef});return delete e.value,r.createElement("input",e)}});e.exports=a},function(e,t,n){t=e.exports=n(3)(),t.push([e.id,"body{padding:30px}input[type=range]{-webkit-appearance:none;-moz-appearance:none;border:none;width:12%;outline:none;background:none}input[type=range]:focus{outline:none}input[type=range]::-webkit-slider-runnable-track{height:4px;background:#0d65a6}input[type=range]::-webkit-slider-thumb{-webkit-appearance:none;box-shadow:0 0 5px rgba(0,0,0,.1);border:1px solid #d0d0d0;height:20px;width:20px;border-radius:50%;background:#fff;margin-top:-8px}input[type=range]:focus::-webkit-slider-thumb{border:1px solid #107aca;box-shadow:0 0 5px #107aca}input[type=range]::-moz-focus-outer{border:0}input[type=range]::-moz-range-track{height:4px;background:#0d65a6;border:none}input[type=range]::-moz-range-thumb{box-shadow:0 0 5px rgba(0,0,0,.1);border:1px solid #d0d0d0;height:20px;width:20px;border-radius:50%;background:#fff}input[type=range]:focus::-moz-range-thumb{border:1px solid #107aca;box-shadow:0 0 5px #107aca}input[type=range]::-ms-track{height:4px;border-color:transparent;border-width:11px 0;background:transparent;color:transparent}input[type=range]::-ms-thumb{box-shadow:0 0 5px rgba(0,0,0,.1);border:1px solid #d0d0d0;height:20px;width:20px;border-radius:50%;background:#fff}input[type=range]::-ms-fill-lower,input[type=range]::-ms-fill-upper{background:#0d65a6}input[type=range]:focus::-ms-thumb{border:1px solid #107aca;box-shadow:0 0 5px #107aca}",""])},function(e,t){},function(e,t,n){function r(e,t){for(var n=0;n<e.length;n++){var r=e[n],o=d[r.id];if(o){o.refs++;for(var a=0;a<o.parts.length;a++)o.parts[a](r.parts[a]);for(;a<r.parts.length;a++)o.parts.push(p(r.parts[a],t))}else{for(var i=[],a=0;a<r.parts.length;a++)i.push(p(r.parts[a],t));d[r.id]={id:r.id,refs:1,parts:i}}}}function o(e){for(var t=[],n={},r=0;r<e.length;r++){var o=e[r],a=o[0],i=o[1],u=o[2],s=o[3],p={css:i,media:u,sourceMap:s};n[a]?n[a].parts.push(p):t.push(n[a]={id:a,parts:[p]})}return t}function a(e,t){var n=g(),r=m[m.length-1];if("top"===e.insertAt)r?r.nextSibling?n.insertBefore(t,r.nextSibling):n.appendChild(t):n.insertBefore(t,n.firstChild),m.push(t);else{if("bottom"!==e.insertAt)throw new Error("Invalid value for parameter 'insertAt'. Must be 'top' or 'bottom'.");n.appendChild(t)}}function i(e){e.parentNode.removeChild(e);var t=m.indexOf(e);t>=0&&m.splice(t,1)}function u(e){var t=document.createElement("style");return t.type="text/css",a(e,t),t}function s(e){var t=document.createElement("link");return t.rel="stylesheet",a(e,t),t}function p(e,t){var n,r,o;if(t.singleton){var a=y++;n=v||(v=u(t)),r=c.bind(null,n,a,!1),o=c.bind(null,n,a,!0)}else e.sourceMap&&"function"==typeof URL&&"function"==typeof URL.createObjectURL&&"function"==typeof URL.revokeObjectURL&&"function"==typeof Blob&&"function"==typeof btoa?(n=s(t),r=l.bind(null,n),o=function(){i(n),n.href&&URL.revokeObjectURL(n.href)}):(n=u(t),r=f.bind(null,n),o=function(){i(n)});return r(e),function(t){if(t){if(t.css===e.css&&t.media===e.media&&t.sourceMap===e.sourceMap)return;r(e=t)}else o()}}function c(e,t,n,r){var o=n?"":r.css;if(e.styleSheet)e.styleSheet.cssText=x(t,o);else{var a=document.createTextNode(o),i=e.childNodes;i[t]&&e.removeChild(i[t]),i.length?e.insertBefore(a,i[t]):e.appendChild(a)}}function f(e,t){var n=t.css,r=t.media;if(r&&e.setAttribute("media",r),e.styleSheet)e.styleSheet.cssText=n;else{for(;e.firstChild;)e.removeChild(e.firstChild);e.appendChild(document.createTextNode(n))}}function l(e,t){var n=t.css,r=t.sourceMap;r&&(n+="\n/*# sourceMappingURL=data:application/json;base64,"+btoa(unescape(encodeURIComponent(JSON.stringify(r))))+" */");var o=new Blob([n],{type:"text/css"}),a=e.href;e.href=URL.createObjectURL(o),a&&URL.revokeObjectURL(a)}var d={},h=function(e){var t;return function(){return"undefined"==typeof t&&(t=e.apply(this,arguments)),t}},b=h(function(){return/msie [6-9]\b/.test(window.navigator.userAgent.toLowerCase())}),g=h(function(){return document.head||document.getElementsByTagName("head")[0]}),v=null,y=0,m=[];e.exports=function(e,t){t=t||{},"undefined"==typeof t.singleton&&(t.singleton=b()),"undefined"==typeof t.insertAt&&(t.insertAt="bottom");var n=o(e);return r(n,t),function(e){for(var a=[],i=0;i<n.length;i++){var u=n[i],s=d[u.id];s.refs--,a.push(s)}if(e){var p=o(e);r(p,t)}for(var i=0;i<a.length;i++){var s=a[i];if(0===s.refs){for(var c=0;c<s.parts.length;c++)s.parts[c]();delete d[s.id]}}}};var x=function(){var e=[];return function(t,n){return e[t]=n,e.filter(Boolean).join("\n")}}()},function(e,t,n){var r=n(6);"string"==typeof r&&(r=[[e.id,r,""]]);n(8)(r,{});r.locals&&(e.exports=r.locals)},function(e,n){e.exports=t}])});
//# sourceMappingURL=dist.slider.js.map