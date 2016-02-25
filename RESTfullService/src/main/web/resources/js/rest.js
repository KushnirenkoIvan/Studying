'use strict';

function restGet() {
    $.ajax({
        type: 'GET',
        url: 'getUser',
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log("id=" + result.id + "; user_name = " + result.name);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    });
}

var restPut = function () {
    $.ajax({
        type: 'PUT',
        url: 'putData',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(new User(22, 'vasiliy')),
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    });
}


function restPost() {
    $.ajax({
        type: 'POST',
        url: 'postData',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(new User(12234, 'name')),
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log('Success!');
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    });
}

function restDelete() {
    $.ajax({
        type: 'DELETE',
        url: 'deleteData/' + 'value to delete',
        dataType: 'json',
        async: true,
        success: function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    });
}

function User(id, name) {
    this.user_id = id;
    this.user_name = name;

}
