import java.util.*;
class Quiz
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] question = {"The Kutchi New Year is celebrated as which of the following?",
								"The Sangai Festival is celebrated in __:",
								"The famous Hornbill festival is celebrated in which of the following States of India?",
								"Which of the following statements about the Gandhara School of Art is NOT correct?",
								"Who is the king of the Netherlands?",
								"Gundecha brothers are well known exponents of which among the following styles of Hindustani Classical Music ?",
								"What was Vincent van Gogh?",
								"In which of the following city Elephant festival is celebrated annually?",
								"‘Me-Dam-Me-Phi’ festival is a festival of which the communities in North Eastern India?",
								"Which state Government confers the Basava Sri award?"};
		String[] correct = {"Aashadhi Beej",
								"Manipur",
								"Nagaland",
								"Gandhara School of art enjoyed the liberal patronage of Indo-Greek rulers.",
								"Willem-Alexander",
								"Dhrupad",
								"Artist",
								"Jaipur",
								"Deori Tribe",
								"Karnataka"};
		String[] answer1 = {"Aashadhi Beej",
								"Manipur",
								"Nagaland",
								"Gandhara School of art enjoyed the liberal patronage of Indo-Greek rulers.",
								"Willem-Alexander",
								"Dhrupad",
								"Artist",
								"Jaipur",
								"Deori Tribe",
								"Karnataka"};
		String[] answer2 = {"Bishuva Sankranti",
								"Assam",
								"Mizoram",
								"It displays Greek artistic influence and the concept of the 'man-god' was essentially inspired by Greek mythological culture.",
								"Willem-Alexzelf",
								"Tharana",
								"Baker",
								"Jodhpur",
								"Tai-Ahom",
								"Andhra Pradesh"};
		String[] answer3 = {"Bestu Varas",
								"Mizoram",
								"Assam",
								"The Gandhara art primarily depicted the Buddhist themes.",
								"Willem-Alexniemand",
								"Khayal",
								"Jobless",
								"Kota",
								"Garo",
								"Maharastra"};
		String[] answer4 = {"Uttrayan",
								"Arunachal Pradesh",
								"Manipur",
								"Artistically, the Gandharan school of sculpture is said to have contributed wavy hair, drapery covering both shoulders, shoes and sandals etc.",
								"Prince Friso of Orange-Nassau",
								"Thumri",
								"Historian",
								"Udaipur",
								"Khasi",
								"Gujarat"};
		String[][] answer = new String[10][4];
		int choice,i,j,l1,l2,l3,l4,right,wrong;
		for(i=0; i<10; i++)
		{
			j=0;
			answer[i][j] = answer1[i];
			j++;
			answer[i][j] = answer2[i];
			j++;
			answer[i][j] = answer3[i];
			j++;
			answer[i][j] = answer4[i];
		}
		i = 0;
		System.out.println("\n Welcome to Quiz Program ");
		System.out.println("\n Here are the rules for the quiz ");
		System.out.println("\n 1) The quiz consists of 10 questions. ");
		System.out.println("\n 2) You will be awarded 4 points for correct answer. ");
		System.out.println("\n 3) Also 1 point will be deducted for wrong answer. ");
		System.out.println("\n 4) You can choose between 4 options provided for the question. ");
		System.out.println("\n 5) Also there is a 5th option which will allows you to quit the quiz at any given point of time. ");
		right = 0;
		wrong = 0;
		do{
			choice = 0;
			j = (int)(1 + Math.random()*4);
			System.out.println("\n Question Number : "+(i+1));
			System.out.println("\n "+question[i]);
			if(j == 4)
			{
				j = 0;
			}
			System.out.println("\n Option 1 : "+answer[i][j]);
			l1 = j;
			j++;
			if(j == 4)
			{
				j = 0;
			}
			System.out.println("\n Option 2 : "+answer[i][j]);
			l2 = j;
			j++;
			if(j == 4)
			{
				j = 0;
			}
			System.out.println("\n Option 3 : "+answer[i][j]);
			l3 = j;
			j++;
			if(j == 4)
			{
				j = 0;
			}
			System.out.println("\n Option 4 : "+answer[i][j]);
			l4 = j;
			System.out.println("\n Option 5 : Exit");
			System.out.print("\n Enter your Option : ");
			int option = sc.nextInt();
			if(option >= 5)
			{
				System.out.println("\n "+right+" points are awarded for correct answers. ");
				System.out.println("\n "+wrong+" points are deducted for wrong answers. ");
				System.out.println("\n Hence total points are : "+(right-wrong));
				break;
			}
			if (option == 1)
			{
				if(answer[i][l1].equals(correct[i]))
				{
					System.out.println("\n Correct Answer !!!! ");
					right += 4;
				}
				else
				{
					System.out.println("\n Wrong Answer !!!! ");
					wrong += 1;
				}
			}
			else if (option == 2)
			{
				if(answer[i][l2].equals(correct[i]))
				{
					System.out.println("\n Correct Answer !!!! ");
					right += 4;
				}
				else
				{
					System.out.println("\n Wrong Answer !!!! ");
					wrong += 1;
				}
			}
			else if (option == 3)
			{
				if(answer[i][l3].equals(correct[i]))
				{
					System.out.println("\n Correct Answer !!!! ");
					right += 4;
				}
				else
				{
					System.out.println("\n Wrong Answer !!!! ");
					wrong += 1;
				}
			}
			else if (option == 4)
			{
				if(answer[i][l4].equals(correct[i]))
				{
					System.out.println("\n Correct Answer !!!! ");
					right += 4;
				}
				else
				{
					System.out.println("\n Wrong Answer !!!! ");
					wrong += 1;
				}
			}
			i++;
			if(i == 10)
			{
				System.out.println("\n That is the end of quiz !!!!");
				System.out.println("\n "+right+" points are awarded for correct answers. ");
				System.out.println("\n "+wrong+" points are deducted for wrong answers. ");
				System.out.println("\n Hence total points are : "+(right-wrong));
				break;
			}
		}while(choice != 5);
	}
}