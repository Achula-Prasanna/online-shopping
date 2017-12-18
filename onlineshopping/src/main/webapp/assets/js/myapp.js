$(function() {
	//solving active menu problem
	switch(menu) {
	
		case 'About US' : 
			$('#about').addClass('active');
			break;
		case 'Contact US' : 
			$('#contact').addClass('active');
			break;
		case 'View Products' :
			$('#listProducts').addClass('active');
			break;
		default: 
			$('#home').addClass('active');
			break;
	}	
});
