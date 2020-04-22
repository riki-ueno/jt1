/**
 * For09.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */

package drill.step04;

/**
 * 指定された標準出力を行いなさい
 * [キーワード]java  for  配列
 * @author mano
 */
public class For06 {

	public static void main(String[] args) {

		System.out.println("------------例題----------------");
		// (例題) 要素が、{java, ruby, c++, python, c#} からなる配列に対して、1つずつ標準出力せよ
		// =======================================================
		// [出力結果]
		// =======================================================
		// java
		// ruby
		// c++
		// python
		// c#
		String[] array = { "java", "ruby", "c++", "python", "c#" };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("------------TODO----------------");
		// TODO 1: 以下のように上記の配列arrayを逆順で標準出力せよ
		// =======================================================
		// [出力結果]
		// =======================================================
		// c#
		// python
		// c++
		// ruby
		// java
		//-----↓実装ここから↓-------

		//-----↑実装ここまで↑-------
	}

}
