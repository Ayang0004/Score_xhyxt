/* 打开一个新页面：调用时不加第二个参数 add by tony */

function formSubmit (url,sTarget){
    document.forms[0].target = sTarget
    document.forms[0].action = url;
    document.forms[0].submit();
    return true;
}