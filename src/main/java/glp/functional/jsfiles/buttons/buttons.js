function init() {
    document.body.dispatchEvent(new CustomEvent('o.InitComponents', {
        detail: {
            elementId: 'button-target',
            componentName: 'Button',
            props: {
                btnType: 'default',
                btnSize: 'small',
                children: 'children',
                onClick: (function () {
                    return alert('Hello World!');
                })
            }
        }
    }));
}
window.onload = init;