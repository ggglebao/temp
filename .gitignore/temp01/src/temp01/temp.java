package temp01;

import java.io.*;

public class temp {
	public static void main (String[] args)throws Exception{
		//����BufferedReader�������ݴӼ��̶���
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
		
		//����whileѭ�������в���
		while(true)
		{
			//�Ӽ����������������������������İ�ȫ�Խ��м��
			System.out.println("�������һ��������0-9��");
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
					System.out.println("���������������Ҫ�����������룺"); 
				}
			}
		
			System.out.println("������ڶ���������0-9��");
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
					System.out.println("���������������Ҫ�����������룺"); 
				}
			}
			
			System.out.println("���������������");
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
					System.out.println("���������������Ҫ�����������룺"); 
				}
			}
			
			//�������ɵ���λ��
			arr[0] = num1 * 100 + num2 * 10 + num3;
			arr[1] = num1 * 100 + num1 * 10 + num2;
			arr[2] = num2 * 100 + num1 * 10 + num3;
			arr[3] = num2 * 100 + num3 * 10 + num1;
			arr[4] = num3 * 100 + num1 * 10 + num2;
			arr[5] = num3 * 100 + num2 * 10 + num1;
			n = 6;
			
			//ȥ����ͬ����λ��
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
			//�����Ϣ
			System.out.println("������ɵ����У�");
			for( i = 0; i < n; i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println(" ");
			
			//��ʾ�Ƿ��˳�
			while(true)
			{
				System.out.println("�Ƿ��˳�:(y/n)");
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
					System.out.println("�������벻����Ҫ�����������롣");
				}		
			}
		}
	}
}
