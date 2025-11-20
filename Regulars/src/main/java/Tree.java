import java.util.Scanner;
public class Tree {
	static int maxi; //глобальный макс и мин
	static int mini;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] tree = {7, 1, 8, 11, 4, 2, 5, 6, 3, 9, 13, 12, 14, 10, 17};
		maxi = tree[0];
		mini = tree[0];
		min(0, tree);
		max(0, tree);
		int x = sc.nextInt();
		char[] route = new char[tree.length]; 
		int ind = finder(route, x, 0, tree);
		if (ind == -1) {System.out.println("Элемент не найден");}
		else {
			System.out.println("Элемент найден. Маршрут:");
			for (char i : route) {
			if (i != 0) {System.out.println(i);} //выводим только путь
			}
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("Максимальный элемент дерева:");
		System.out.println(maxi);
		route = new char[10];
		finder(route, maxi, 0, tree); //ищем максимальное
		System.out.println("Маршрут максимального числа:");
		for (char i : route) {
			if (i != 0) {System.out.println(i);} //выводим только путь
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("Минимальный элемент дерева:");
		System.out.println(mini);
		route = new char[10];
		finder(route, mini, 0, tree); //ищем минимальное
		System.out.println("Маршрут минимального числа:");
		for (char i : route) {
			if (i != 0) {System.out.println(i);} //выводим только путь
		}
	}

	public static void max(int ind, int[] arr) { //метод поиска максимума
		if (ind >= arr.length) {return;}
		if (maxi < arr[ind]) {maxi = arr[ind];} //максимум присваивается
		max(2 * ind + 2, arr); //берём правый
		max(2 * ind + 1, arr); //берём левый
	}
	public static void min(int ind, int[] arr) { //метод поиска минимума
		if (ind >= arr.length) {return;}
		if (mini > arr[ind]) {mini = arr[ind];}
		min(2 * ind + 2, arr);
		min(2 * ind + 1, arr);
	}
	public static int finder(char[] route, int x, int nodeIndex, int[] arr) { //метод поиска элемента и выдачи пути к нему
		if (x == arr[nodeIndex]) {return nodeIndex;}
		//проверка наличия потомка по индексу
		int l;
		if (2 * nodeIndex + 1 < arr.length) { //проверка на выход за пределы строки для левой стороны
			l = finder(route, x, 2 * nodeIndex + 1, arr); //выполняем поиск
			if (l >= 0 ) {route[nodeIndex] = 'l'; return l;} //если нашли в левом, то добавляем в массив левую сторону
		}
		if (2 * nodeIndex + 2 < arr.length) { //проверка на выход за пределы строки для правой стороны
			l = finder(route, x, 2 * nodeIndex + 2, arr); //выполняем поиск
			if (l >= 0 ) {route[nodeIndex] = 'r'; return l;} //если нашли в левом, то добавляем в массив левую сторону
		}
		return -1; //если не нашли нигде, то выдаём -1
	}

}