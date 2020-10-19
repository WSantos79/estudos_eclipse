#include<stdio.h>

 int main(){

	 int ano_2014[3], ano_2015[3], ano_2016[3];
	 float media_2014 = 0, media_2015 = 0, media_2016 = 0;
	 ano_2014[0] = 16319979;
	 ano_2014[1]  = 4133366;
	 ano_2014[2]  = 658713;

	 ano_2015[0] = 16834629;
	 ano_2015[1] = 4268872;
	 ano_2015[2] = 664617;

	 ano_2016[0] = 17247123;
	 ano_2016[1] = 4378772;
	 ano_2016[2] = 669056;

	 media_2014 = (ano_2014[0] + ano_2014[1] + ano_2014[2]) / 3;
	 media_2015 = (ano_2015[0] + ano_2015[1] + ano_2015[2]) / 3;
	 media_2016 = (ano_2016[0] + ano_2016[1] + ano_2016[2]) / 3;

	 if (media_2014 > media_2015 && media_2014 > media_2016) {
		 printf("A maior media foi no ano de 2014 com a media de: %.2f", media_2014); }
		 else if (media_2015 > media_2014 && media_2015 > media_2016) {
					 printf("A maior media foi no ano de 2015 com a media de: %.2f", media_2015);
		 }
					 else if (media_2016 > media_2015 && media_2016 > media_2014){

				 printf("A maior media foi no ano de 2016 com a media de: %.2f", media_2016);

					 }

}

