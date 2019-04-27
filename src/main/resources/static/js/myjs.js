//修改前回显
function edit(data) {
    location.href = "/userUpload?userId=" + data;
}


//删除
function del(userId) {
    $.ajax({
        url: '/userDel',
        data: {"userId": userId},
        dataType: 'json',
        type: 'post',
        success: function (data) {
            if (data > 0) {
                alert("删除成功");
                location.href = "/getAll";
            } else {
                alert("删除失败")
            }
        }


    })
}

//修改
function update() {
    $.ajax({
        url: 'userUpdate',
        data: {
            "userId": $("#userId").val(),
            "userName": $("#userName").val(),
            "userPassword": $("#userPassword").val()
        },
        type: 'post',
        dataType: 'json',
        success: function (data) {
            if (data > 0) {
                alert("修改成功");
                location.href = "/getAll"
            } else {
                alert("修改失败")
            }
        }
    })
}

function toAddUser() {
    location.href = "/toAddUser";
}

