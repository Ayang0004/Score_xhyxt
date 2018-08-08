
/* 注册表单的js校验 */
function checkForm(){
	//>>非空校验
	var res1 = checkNull("username", "用户名不能为空!");
	var res11 = checkNull("stuNum", "学/工号不能为空!");
	var res12 = checkNull("teachNum", "学/工号不能为空!");
	var res2 = checkNull("password", "密码不能为空!");
	var res3 = checkNull("password2", "确认密码不能为空!");
	var res4 = checkNull("phonenumber", "手机号码不能为空!");
	var res5 = checkNull("email", "邮箱不能为空!");
	var res6 = checkNull("valistr", "验证码不能为空!");
    var res9 = checkNull("relname", "姓名不能为空!");
	
	//>>两次密码是否一致
	var res7 = checkPassword("password", "两次密码不一致!");
	
	//>>邮箱格式是否正确
	var res8 = checkEmail("email", "邮箱格式不正确!");

    //>>手机号码格式是否正确
    var res10 = checkTel("phonenumber", "手机号码格式不正确1!");
	
	return res2 && res3 && res4 && res5 && res6 && res7 && res8 && res9 && res10 && res11 && res12;
}

/* 邮箱格式是否正确 */
function checkEmail(name, msg){
	var email = $("input[name='"+name+"']").val().trim();
	var regExp = /^\w+@\w+(\.[a-z]+)+$/;
	
	//检查邮箱是否为空
	checkNull("email", "邮箱不能为空!");
	
	if(email != "" && !regExp.test(email)){
		setMsg(name, msg);
		return false;
	}
	return true;
}
/*手机号码格式校验*/
function checkTel(name,msg){

    var phonenumber = $("input[name='"+name+"']").val().trim();
    var regExp = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
    //检查手机是否为空
    checkNull("phonenumber", "手机号码不能为空!");
    if(phonenumber != "" && !regExp.test(phonenumber)){
        setMsg(name, msg);
        return false;
    }
    return true;
}

/* 检查两次密码是否一致 */
function checkPassword(name, msg){
	//获取密码
	var psw1 = $("input[name='"+name+"']").val().trim();
	//获取确认密码
	var psw2 = $("input[name='"+name+"2']").val().trim();
	
	//检查确认密码输入框是否为空
	checkNull("password2", "确认密码不能为空！");
	
	if(psw1 != "" && psw2 != "" && psw1 != psw2){
		setMsg(name+"2", msg);
		return false;
	}
	return true;
}

/* 检查输入项是否为空 */
function checkNull(name, msg){
	var value = $("input[name='"+name+"']").val().trim();
	//清空上次的提示消息
	setMsg(name, "");
	
	if(value == ""){
		setMsg(name, msg);
		return false;
	}
	return true;
}
/* 在校验失败时, 设置错误提示消息 */
function setMsg(name, msg){
	var $oInp = $("input[name='"+name+"']");
	var $oSpan = $oInp.nextAll("span");
	$oSpan.html(msg);
	$oSpan.css("color", "black");
	$oSpan.css("font", "14px");

}


//文档就绪事件, 在整个html文档加载完之后立即执行
$(function(){
	
});