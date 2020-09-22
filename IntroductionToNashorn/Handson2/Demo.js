var count=0;
var checkPrime = function(number) {
	for(var i=2;i<=number;i++) {
		if(number%i==0) {
			count+=1;
		}
	}
	if(count==1) {
		return true;
	} else {
		return false;
	}
}