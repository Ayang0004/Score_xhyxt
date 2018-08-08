$(function () {
    $.getJSON("/rest/api/content/category", null, function (data) {
        var _data = data.data
        var _navBar = $("#navBar");
        var menulist = "";
        $.each(_data, function (i, n) {
            if (i == 0) {
                menulist += '<ul class="nav clearfix">';
                $.each(n.i, function (i, n) {
                    if (i == 0) {
                        menulist += '<li class="m"><h3><a href="#">' + n.n + '</a></h3>';
                    } else {
                        menulist += '<li class="s">|</li><li class="m"><h3><a href="#">' + n.n + '</a></h3>';
                    }
                    if (n.i != null) {
                        menulist += '<ul class="sub">';
                        $.each(n.i, function (p, q) {
                            menulist += '<li><a href="#" title="'+q.n+'">' + q.n + '</a></li>';
                        });
                        menulist+='</ul>';
                    }
                    menulist+='</li>';
                })
                menulist += '</ul>';
            }
        });
        _navBar.append(menulist);
        alert(menulist);

    })
});