'use strict';

function getInfo() {
    $.ajax({
        type: 'GET',
        url: '/getInfo',
        // dataType: 'text',
        async: true,
        success: function (response) {
            $("#responseContent").html(response);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    });
}