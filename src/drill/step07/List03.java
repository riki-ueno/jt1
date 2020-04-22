/**
 * ArrayList01.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */

package drill.step07;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList問題
 * リストの要素を表示
 *
 * [キーワード]java, list, arraylist
 *
 * @author mano
 */
public class List03 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// TODO: 要素 "aaa", "bbb", "ccc"を1つずつ取り出してみよう
		// =======================================================
		// [出力例]
		// =======================================================
		// aaa
		// bbb
		// ccc
		display(list);

	}

	/**
	 * リストを全件表示します。
	 * リストはnullでなく、サイズが1以上の入力だという前提で考えて良い
	 *
	 * @param list リスト
	 */
	public static void display(List<String> list) {

		// TODO: 実装せよ
		//-----↓実装ここから↓-------

		//-----↑実装ここまで↑-------

	}

}
