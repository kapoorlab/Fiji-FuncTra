package chirpModels;

public class LinearChirp implements ChirpFitFunction {

	public double val(double t, double[] a, double [] b, int totaltime, int timeindex, int degree) {

		double Sinusoid = b[timeindex] * Math.cos(a[0] * t + (a[1] - a[0])* t * t / (2 * totaltime) 
				+ a[2]) + a[3];
		
		return Sinusoid;
	}

	/*
	 * Gradient function
	 * 
	 */
	public double grad(double t, double[] a, double [] b, int totaltime, int k, int timeindex, int degree) {

		

		 if (k == 0) {

			double Sinusoid = -b[timeindex] * Math.sin(a[0] * t
					+ (a[1] - a[0]) * t * t / (2 * totaltime)  + a[2]) * ( t -  t * t / (2 * totaltime) );

			return Sinusoid;

		}

		else if (k == 1) {

			double Sinusoid = -b[timeindex] * Math.sin(a[0] * t
					+ (a[1] - a[0]) * t * t / (2 * totaltime)  + a[2]) * t * t
					/ (2 * totaltime) ;

			return Sinusoid;

		}

		

		else if (k == 2) {

			double Sinusoid = -b[timeindex] * Math.sin(a[0] * t
					+ (a[1] - a[0]) * t * t / (2 * totaltime) + a[2]) ;

			return Sinusoid;

		}
		
		else if (k == 3){
			
			return 1;
		}
		
		
		else return 0;
	}

}
