# Das ist eine Wiederholung der objektorientierten Konzepte.

Bitte versuche als Übung alles in Markdown zu beantworten. Hier ist ein [Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

1. Was ist das Ziel der Objektorientierung?
 * Aufteilung der Arbeitsschritte in großen Projekten ermöglichen 
 * Wiederverwendbarkeit von Komponenten
2. Gibt es OOP nur in Java?
   Auch in 
 * C#  
 * C++
3. Was ist der Unterschied zwischen Objekt und Klasse?
 * **Objekt:** ist die Instanz einer Klasse.
   Ein Objekt wird mit Hilfe einer Klasse erstellt.
   ---
 * **Klasse:** enthält Eigenschaften und Methoden von Objekten. 
4. Wie erzeuge ich eine neue Instanz? (Welches Schlüsselwort gibt es dafür)
 * **new**
5. Was bedeutet das Schlüsselwort `static` und wo kann es überall verwendet werden?
 * Static sind jene Merkmale der Klasse, die nicht von den Objekten geteilt werden. Sie sind innerhalb der Methode unique.
   **Super Beispiel gefunden!** Die Klasse ist die Backform, das Objekt das Keks. Die Klasse besteht aus Stahl und hat scharfe Kanten, das Keks nicht - 
   daher sind Material und Kanten static.
   [Quelle]: http://www.gailer-net.de/tutorials/java/Notes/chap25/ch25_12.html
6. Wozu dient die Vererbung?
 * Sie dient der **Wiederverwendbarkeit**, Attribute und Methoden müssen nicht nocheinmal programmiert werden.
7. Kann in Java von mehreren Klassen geerbt werden? Wenn ja wie?
 * Mehrfachvererbung ist nur über Interface möglich.
8. Welche Vererbungshierarchien kennst du? (Ein Bild reicht aus)
  * Eltern-Kind, wörtlich beschrieben mit "Ist eine Art von...".
9. Was beudeted Casten und wie ist die Syntax in Java dafür?
  * **Casten** bedeutet die Umwandlung von Datentypen.
    Das Casten zu einem größeren Datentyp (Bsp. int zu double) funktioniert implizit, umgekehrt geht nur "händisch".
    `double decimal = 4.12;
    int number = (int) decimal;`
10. Was ist der Unterschied zwischen explizieten und impliziten Typecasting?
 * Siehe Frage 9.
11. Erkläre die folgenden Schlüsselwörter: `super`, `this`
 * **Super** bezieht sich in der Vererbung auf die Oberklasse.
---
   **This** ist die Referenz auf das Objekt, das aktuell gemeint ist.
12. Für was dient der `instanceof` Operator. Gib ein sinnvolles Beispiel.
 * Mit **instanceOf** wird überprüft, ob ein Objekt die Instanz einer bestimmten Klasse ist.
`public class CodersBay {
    public static void main(String[] args) {
        CodersBay Julia = new CodersBay();
        System.out.println(Julia instanceof CodersBay); // zum Glück "true"
    }
}`
 ---
 Eclipse bietet auch Markdown unterstützung inklusive Preview. Für die Verwendung muss kein Plugin installiert werden.
