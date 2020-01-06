function showData(){
    var ele = document.getElementsByClassName("shows");
    
    for(var i=0;i<ele.length;i++){
        ele[i].innerHTML = `<div class=\"container\">
        
        <div class=\"row \">
        <div class="col-md-2 h-2"></div>
            <div class=\"col-md-4 h-2\">
                <img src=\"./assets/poster.jpg\" width=\"100%\" height=\"100%\">
            </div>
            <div class=\"col-md-6 h-2\">
                <div class=\"row h-1\">
                    <h4 style="color:white">Dabangg 3</h4>
                </div>
                <div class=\"row h-1\">
                    <p style="color:white">Showtimes</p>
                    <div class=\"col-md-2\"><button class=\"btn btn-md btn-warning\">27 Dec</button></div>
                    <div class=\"col-md-2\"><button class=\"btn btn-md btn-warning\">28 Dec</button></div>
                    <div class=\"col-md-2\"><button class=\"btn btn-md btn-warning\">29 Dec</button></div>
                </div>
                <div class=\"row h-1\">
                    <h5 style="color:white">Rating : 2.1</h5>
                </div>
            </div>
        </div>
        </div>`;
    }
    
    
}
showData();