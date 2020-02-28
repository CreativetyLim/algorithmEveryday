import java.util.Arrays;
import java.util.Scanner;

public class permutation {
	public static boolean next_permutation(int[] a) {
		int i = a.length - 1; // i�� �ִ� �ε����� �ΰ�
		while (i > 0 && a[i - 1] >= a[i])
			i -= 1; // ���� �ε��� ���ڰ� 1���� �ε������� Ŭ������
		if (i <= 0)
			return false; // 0���� �۰ų� �������� return false;
		int j = a.length - 1;
		while (a[i - 1] >= a[j])
			j -= 1;// ���� �ε��� ���ڰ� ������ ã�� i ���� 1���� ĭ ���� Ŭ������

		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp; // ���� ã���ΰ��� �ٲ�
		j = a.length - 1;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}

	public static boolean prev_permutation(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] <= a[i])
			i -= 1;
		if (i <= 0)
			return false;
		int j = a.length - 1;
		while (a[i - 1] <= a[j])
			j -= 1; // ���⸸ �ٸ� ������

		swap(a, i - 1, j);// �Ȱ����� ������ ���� ����
		j = a.length - 1;
		while (i < j) {
			swap(a, i, j);
			i += 1;
			j -= 1;
		}
		return true;
	}

	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		Arrays.sort(a);// sort���ִ� ������ �������ε�� ���� ����̰� �װ� �ƴϸ� �����൵�˴�

		System.out.println("�ٷ� ���� ����");
		next_permutation(a);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("�ٷ� ���� ����");
		prev_permutation(a);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("��� ����");
		do {
			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		} while (next_permutation(a));

	}
}
