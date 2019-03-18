//for filtering OpenBCI data

DataFilterNotch : DataFilter {
	classvar <constants;
	*initClass {
		constants= (  //from OpenBCI_GUI/DataProcessing.pde
			'60': (
				125: (
					b: DoubleArray[0.931378858122982, 3.70081291785747, 5.53903191270520, 3.70081291785747, 0.931378858122982],
					a: DoubleArray[1, 3.83246204081167, 5.53431749515949, 3.56916379490328, 0.867472133791669]
				),
				200: (
					b: DoubleArray[0.956543225556877, 1.18293615779028, 2.27881429174348, 1.18293615779028, 0.956543225556877],
					a: DoubleArray[1, 1.20922304075909, 2.27692490805580, 1.15664927482146, 0.914975834801436]
				),
				250: (
					b: DoubleArray[0.965080986344733, -0.242468320175764, 1.94539149412878, -0.242468320175764, 0.965080986344733],
					a: DoubleArray[1, -0.246778261129785, 1.94417178469135, -0.238158379221743, 0.931381682126902]
				),
				500: (
					b: DoubleArray[0.982385438526095, -2.86473884662109, 4.05324051877773, -2.86473884662109, 0.982385438526095],
					a: DoubleArray[1, -2.89019558531207, 4.05293022193077, -2.83928210793009, 0.965081173899134]
				),
				1000: (
					b: DoubleArray[0.991153595101611, -3.68627799048791, 5.40978944177152, -3.68627799048791, 0.991153595101611],
					a: DoubleArray[1, -3.70265590760266, 5.40971118136100, -3.66990007337352, 0.982385450614122]
				),
				1600: (
					b: DoubleArray[0.994461788958027, -3.86796874670208, 5.75004904085114, -3.86796874670208, 0.994461788958027],
					a: DoubleArray[1, -3.87870938463296, 5.75001836883538, -3.85722810877252, 0.988954249933128]
				)
			),
			'50': (
				125: (
					b: DoubleArray[0.931378858122983, 3.01781693143160, 4.30731047590091, 3.01781693143160, 0.931378858122983],
					a: DoubleArray[1, 3.12516981877757, 4.30259605835520, 2.91046404408562, 0.867472133791670]
				),
				200: (
					b: DoubleArray[0.956543225556877, -2.34285519884863e-16, 1.91308645111375, -2.34285519884863e-16, 0.956543225556877],
					a: DoubleArray[1, -1.41553435639707e-15, 1.91119706742607, -1.36696209906972e-15, 0.914975834801435]
				),
				250: (
					b: DoubleArray[0.965080986344734, -1.19328255433335, 2.29902305135123, -1.19328255433335, 0.965080986344734],
					a: DoubleArray[1, -1.21449347931898, 2.29780334191380, -1.17207162934771, 0.931381682126901]
				),
				500: (
					b: DoubleArray[0.982385438526090, -3.17931708468811, 4.53709552901242, -3.17931708468811, 0.982385438526090],
					a: DoubleArray[1, -3.20756923909868, 4.53678523216547, -3.15106493027754, 0.965081173899133]
				),
				1000: (
					b: DoubleArray[0.991153595101607, -3.77064677042206, 5.56847615976560, -3.77064677042206, 0.991153595101607],
					a: DoubleArray[1, -3.78739953308251, 5.56839789935513, -3.75389400776205, 0.982385450614127]
				),
				1600: (
					b: DoubleArray[0.994461788958316, -3.90144402068168, 5.81543195046478, -3.90144402068168, 0.994461788958316],
					a: DoubleArray[1, -3.91227761329151, 5.81540127844733, -3.89061042807090, 0.988954249933127]
				)
			)
		);
	}
	init {|argType|
		type= argType;
		if(constants.keys.includes(type).not, {
			"frequency % not supported. only %".format(type, constants.keys.asArray).warn;
			type= '50';
		});
		key= type;
	}
}