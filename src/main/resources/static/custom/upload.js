$('#upload-submit').click(function(event) {
    event.preventDefault();
    var formData = new FormData();
    var files = document.getElementById('files').files;
    for (var i = 0; i < files.length; i++) {
        formData.append('files', files[i]);
    }

    $.ajax({
        url: '/files/upload',
        type: 'POST',
        data: formData,
        dataType: 'json',
        contentType: false,
        processData: false,
        success: function(response) {
            if (response['status'] == 'OK') {
                $.notify({
                    title: "<strong>Info</strong> ",
                    message: response['message'],
                }, {
                    type: 'success'
                });
            }
        }
    });

});