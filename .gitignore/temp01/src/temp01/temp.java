package temp01;

import java.io.*;

public class temp {
	public static void main (String[] args)throws Exception{
		//理由BufferedReader进行数据从键盘读入
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String a;
		String b;
		int num1;
		int num2;
		int num3;
		int arr[] = new int[10];
		int n;
		int i;
		int j;
		int k;
		
		//利用while循环，进行操作
		while(true)
		{
			//从键盘输入三个数，并对这三个数的安全性进行检测
			System.out.println("请输入第一个数：（0-9）");
			while(true)
			{
				a = br.readLine();
				num1 = Integer.parseInt(a);
				if(num1 >= 0 && num1 <= 9)
				{
					break;
				}
				else
				{
					System.out.println("您输入的数不符合要求，请重新输入："); 
				}
			}
		
			System.out.println("请输入第二个数：（0-9）");
			while(true)
			{
				a = br.readLine();
				num2 = Integer.parseInt(a);
				if(num2 >= 0 && num2 <= 9)
				{
					break;
				}
				else
				{
					System.out.println("您输入的数不符合要求，请重新输入："); 
				}
			}
			
			System.out.println("请输入第三个数：");
			while(true)
			{
				a = br.readLine();
				num3 = Integer.parseInt(a);
				if(num3 >= 0 && num3 <= 9)
				{
					break;
				}
				else
				{
					System.out.println("您输入的数不符合要求，请重新输入："); 
				}
			}
			
			//初步构成的三位数
			arr[0] = num1 * 100 + num2 * 10 + num3;
			arr[1] = num1 * 100 + num1 * 10 + num2;
			arr[2] = num2 * 100 + num1 * 10 + num3;
			arr[3] = num2 * 100 + num3 * 10 + num1;
			arr[4] = num3 * 100 + num1 * 10 + num2;
			arr[5] = num3 * 100 + num2 * 10 + num1;
			n = 6;
			
			//去除相同的三位数
			for(i = 0; i < n - 1; i++)
			{
				for(j = i + 1; j < 6; j++)
				{
					if(arr[i] == arr[j])
					{
						for(k = j ; k < 5; k++)
						{
							arr[k] = arr[k + 1];
						}
						n--;
					}
				}
			}
			System.out.println(n);
			//输出信息
			System.out.println("可能组成的数有：");
			for( i = 0; i < n; i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println(" ");
			
			//提示是否退出
			while(true)
			{
				System.out.println("是否退出:(y/n)");
				b = br.readLine();
				if(b.equals("y"))
				{
					System.exit(0);
				}
				else if(b.equals("n"))
				{
					break;
				}
				else
				{
					System.out.println("您的输入不符合要求，请重新输入。");
				}		
			}
		}
	}
}
