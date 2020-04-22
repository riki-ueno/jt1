/**
 * StringAPI02.java
 *
 * Copyright (C) 2014 by Future Architect, Inc. Japan
 */

package drill.step05;

/**
 * String型のAPI問題
 * [キーワード]java String API
 * [ヒント1]　以下のAPIリファレンスや参考書などを参考にすること。
 * 　　　　　また、Eclipseであれば、String文字列にドット「.」をつけて、ctrl + space でメソッド候補一覧が出力される。
 * http://docs.oracle.com/javase/jp/7/api/java/lang/String.html
 *
 * // [ヒント2] substring
 *
 * @author mano
 */
public class String02 {

	public static void main(String[] args) {

		// 以下の文字列を指定された出力を行う部分文字列を作成する
		String word = "abcdefg";

		// TODO 1: 部分文字列を作成し、標準出力せよ
		// =======================================================
		// [出力結果]
		// =======================================================
		// defg
		//-----↓実装ここから↓-------
		System.out.println(word.substring(3));
		//-----↑実装ここまで↑-------

		// TODO 2: 部分文字列を作成し、標準出力せよ
		// =======================================================
		// [出力結果]
		// =======================================================
		// cdef
		//-----↓実装ここから↓-------
		System.out.println(word.substring(2, 6));
		//-----↑実装ここまで↑-------

	}

}
