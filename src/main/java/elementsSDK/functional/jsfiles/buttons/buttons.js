function init() {
document.body.dispatchEvent(new CustomEvent('o.InitCoachMark', {detail:{elementId:'button-target',componentName:'Button',opts:{btnType:'cta',btnSize:'large',children:'children',onClick:'(function () {return alert('Hello World!')}}}));}window.onload = init;
