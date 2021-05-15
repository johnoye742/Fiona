/*
 * Copyright (C) 2021 John
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fiona;
import java.util.Scanner;
import org.jsoup.*;
import org.jsoup.nodes.Document;

/**
 *
 * @author John
 */

public class FionaScrapper {
   public static String intro = "Hello I Am Fiona Scrapper.\nInput A URL And I'll Scrape Data from it:";
    
    public static void main(String[] args) {
        try {
        Fiona.print(intro);
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        Document d = Jsoup.connect(url).get();
        System.out.println("Data:\n"+d);
    } catch(Exception e) {
        e.printStackTrace();
    }
    }
}
