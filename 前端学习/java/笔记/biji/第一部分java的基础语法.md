

[TOC]

# 前言

## 计算机和网络

### 学习本节内容将可以了解到

1.了解计算机的软硬件基础

2.了解计算机网络

3.了解基本的dos命令



### 一：计算机的软硬件 

**1.进入企业之后的常常工作** 

1）软件的开发汇报工作

​	①使用常用的工具软件

​		收集信息->汇报->讨论->开发->提交

​	②使用常用的办公软件	

​		office软件

2）计算机的日常维护

​	①购置硬软件

​	②修复计算机系统

​	③杀毒



**2.计算机的组成** 

1）硬件

硬件是指完成输入 存储、处理、输出功能的具体设备  

2）软件

软件用来控制硬件正确有效地完成各种功能   QQ   WPS......



Q:  如和购买电脑 看什么配置

主要关注性能和价格-->性价比

构成：

​	主板	显卡	CPU	内存	硬盘	光驱	声卡	音响		......

Q：请问 Intel 和AMD公司的主要产品是什么

​	①中央处理器：计算机运算与控制的核心

​	②CPU得到部件

​		算术逻辑单元（ALU）：负责计算机执行的所有数学和逻辑工作

​		控制单元（CU）：控制计算机的其他部件

​	③CPU的性能指标---主频

​		主频：CPU内核工作的时钟频率，也就是CPU工作频率

​				例如：Intel 酷睿   **i5**    3.2G

​		相关概念：

​			外频：主板上的系统总线的工作频率

​			倍频：CPU外频与主频相差的倍数

​			公式：主频＝外频X倍频

  		如：

​		在生活中会有类似这样的场景，分发物料。有原料分发处，物资分配，生产线和仓库。

​	那么其中物资分配和生产线就相当于CPU,物料的分发就相当于数据。生产线到仓库就是处理的结果。

​	

​	3）硬盘 ：计算机永久性存储介质

​		计算机存储器以位和字节计量

​		 8 bit        —— 1 byte 

​		1024 byte  —— 1 KB 

​		1024 KB    —— 1 MB 

​		1024 MB    —— 1 GB

​		1024 GB    —— 1 TB

​	性能指标：

​		容量：2G→13G → 20G →… → 200G不断攀升

​		转速：硬盘的主轴转速是硬盘内部数据传输率的决定因素之一

​		

4）内存条

​	计算机的存储器

​		主存：RAM、ROM

​		辅存：硬盘、U盘

​	RAM：随机访问存储器

​		内存：计算机的临时存储区

​		特点

​			允许读写数据

​			易失性

​	ROM：只读存储器

​			集成在主路芯片上，存储系统基本数据

​			特点

​				允许访问和读取数据，但不能修改

​				非易失性



5）显卡

​		显卡：

​                   控制电脑的图形输出，负责将CPU送来的的影像数据处理成显示器认识的格式，再送到显示器形成图像

​		显卡决定显示器的刷新频率和分辨率

​		显存容量：显卡上本地显存的容量数

​		大小决定显存临时存储数据的能力，一定程度影响显卡性能

6）主板

​	主板：计算机中各种设备的连接载体

​	主板芯片组决定主板的全部功能

​	主要厂商

​	Intel	华硕	微星	技嘉



### 二：网络

​	1.概述：计算机网络实现数据通信。计算机网络覆盖的地理区域决定了它的类型。

它可分为：局域网，城域网，广域网。

​	1）局域网

​		局限在小的地理区域内或单独的建筑物内

​		范围：几十米～几公里传		

​		特点：输速度快

​		连接设备

​		双绞线，集线器、交换机

​	

​	2）城域网

​		规模局限在一个城市的范围内

​		区域：几公里～几十公里

​		连接设备：光纤，路由器

​		

​	3）广域网

​		网络跨越国界、洲界，甚至全球范围

​		典型代表：Internet

​		连接设备：海底光缆



2.Internet简介

​	Internet ：一个巨大的网络集合

​	Intranet：采用互联网技术的企业内部网

​	Internet提供的服务：远程登录	文件传输   电子邮件    WWW

​			WWW（World Wide Web）: 万维网服务

​			客户端：向另一台计算机请求某种服务的计算机

​			服务器：为其他计算机的请求提供服务的计算机

3.客户端/服务器模型

​	C/S：客户端/服务器

​		客户端向服务器发出请求，服务器处理请求并将响应发送给客户端



​	B/S：浏览器/服务器

​		浏览器将请求发送给Web服务器，Web服务器对请求进行处理，将响应发回浏览器



4.网络通信原理

​	IP地址：唯一标识网络上的每一台计算机	

​	TCP/IP：传输控制/网际协议，Internet的基础 

​	路由交换设备：将数据从一台计算机送到另一台计算机

5.为什么需要域名解析

​	IP地址唯一定位一台主机，需要将www.taobao.com转换成IP地址

​	域名系统（DNS）：将域名映射成IP地址



6.网络的检测和诊断

​	配置了IP地址后，常常出现网络连接不通的故障，怎么检测?

​	使用ipconfig  查看ip地址

​	使用ping检查是否可以ping通地址

​	故障解决：修改ip、检查网线、网卡是否松动、接触不良等。



### 三：dos命令和进制之间的转换

1.dos命令

cd：用于改变当前目录

​	cd ..		返回上一级

​	cd\		返回根目录

​	d:		切换盘符

dir：显示一个目录下的文件和子目录

md：用于新建目录

edit：一个简单的编辑软件，经常用它来编辑一些程序和批处理文件

​	edit a.txt  保存后退出

​	type a.txt    显示文件内容

copy：复制一个或一组文件到指定磁盘或目录中

​	如：copy a.txt d:\myfile

rd：删除空目录【不能删除非空和当前自己目录】

del：删除目录中的一个或一组文件

​	del d:\myfile\*

Move:将文件或目录从一个位置移动到另一个位置

​	move d:\myfile\a.txt  d:\youfile

ren：对目录中的一个文件或一组文件更改名称

​	ren myfile file

fomat：格式化磁盘

​	format d   【轻易不要尝试】





2.进制的转换

1）进制说明

   ①十进制数制系统包括 10 个数字 

​	0、1、2、3、4、5、6、7、8、9

   ②计算机中使用二进制表示数据

​	二进制位：0和1    【101010】

 ③用于缩短二进制的数字长度

​	八进制基数是8，使用的数据 0、1、2、3、4、5、6、7

​	如：123）8

④计算机中以数量表示色彩【RGB】

十六进制数制系统的基数是 16

十进制：		0、1、2、3、4、5、6、7、8、9

十六进制		0、1、2、3、4、5、6、7、8、9 A、B、C、D、E、F

示例：12B、00FFFF

2）进制的转换

为什么需要进行数制转换

人类最容易理解十进制计算机只认二进制

转换举例

（101）10  = 1 * 102  + 0 * 101  + 1 * 100  = 101

（101）2  = 1 * 22 + 0 * 21 + 1 * 20 = 5

（101）8 = 1 * 82 + 0 * 81 + 1 * 80 = 65

（101）16  = 1 * 162  + 0 * 161  + 1 * 160 = 257

**十进制 与八进制的转换** 

~~~java
十进制转换二进制   除以2	取余数
789/2=394 	余1 第10位
394/2=197 	余0 第9位
197/2=98 	余1 第8位
98/2=49 	余0 第7位
49/2=24 	余1 第6位
24/2=12		余0 第5位
12/2=6 		余0 第4位
6/2=3 		余0 第3位
3/2=1 		余1 第2位
1/2=0 		余1 第1位
~~~

~~~java
二进制转十进制
方法一：
小数点前或者整数要从右到左用二进制的每个数去乘以2的相应次方并递增,小数点后则是从左往右乘以二的相应负次方并递减。
1101.01（2）=1*2^0+0*2^1+1*2^2+1*2^3 +0*2^-1+1*2^-2=1+0+4+8+0+0.25=13.25（10）
方法二：
把二进制数首先写成加权系数展开式，然后按十进制加法规则求和。这种做法称为"按权相加"法。
2的0次方是1（任何数的0次方都是1，0的0次方无意义）
二进制数  100011   转成十进制数可以看作这样：
数字中共有三个1 即第六位一个，第二位一个，第一位一个（从右到左），然后对应十进制数即2的0次方+2的1次方+2的5次方， 即
100011=32+0+0+0+2+1=35
~~~





**十进制和八进制的转换** 



~~~java
八->十
描述：八进制就是逢8进1，八进制数采用 0～7这八数来表达一个数。

方法：八进制数从低位到高位（即从右往左）计算，第0位的权值是8的0次方，第1位的权值是8的1次方，第2位的权值是8的2次方，依次递增下去，把最后的结果相加的值就是十进制的值了。

举例：将八进制的(53)O转换为十进制的步骤如下：

第0位 3 x 8^0 = 3；

第1位 5 x 8^1 = 40；

读数，把结果值相加，3+40=43，即(53)O=(43)

~~~

~~~java
十-->八
方法：除8取余法，即每次将整数部分除以8，余数为该位权上的数，而商继续除以8，余数又为上一个位权上的数，这个步骤一直持续下去，直到商为0为止，最后读数时候，从最后一个余数起，一直到最前面的一个余数

举例：将十进制的(796)转换为八进制的步骤如下：

将商796除以8，商99余数为4；

将商99除以8，商12余数为3；

将商12除以8，商1余数为4；

将商1除以8，商0余数为1；

读数，因为最后一位是经过多次除以8才得到的，因此它是最高位，读数字从最后的余数向前读，1434

~~~



~~~java
十六进制转十进制

2AF5换算成10进制:
第0位： 5*16^0=5
第1位： F*16^1=15*16^1=240
第2位： A*16^2=10*16^2=2560
第3位： 2*16^3=8192
直接计算就是：  5*16^0+F*16^1+A*16^2+2*16^3
~~~

~~~JAVA
十进制转十六进制   就是拿一个数除以16
给你一个十进制，比如：120，如何将它转换成十六进制数呢？
10进制数转换成十六进制数，这是一个连续除以16的过程：把要转换的数，除以16，得到商和余数，将商继续除以16，直到商为0。最后将所有余数倒序排列，得到数就是转换结果。

	120  /16 = 7  % 8
     7   /16 = 0  % 7  
  十六进制结果为   78
~~~















## 课程体系介绍 







# 第一部分：java的基础语法



## 第一章 初识 java

### 1.java概述

**1）java是什么** 

   是计算机的一种编程语言,来完成人们下达的指令。类似的还有c、c++、c#  、php、python......

**2）为什么是java** 

  ![](./photo/1.jpg) 



**3) java的产生**  

Java是Sun Microsystems于1995年推出的高级编程语言；

java之父Jgosling团队在开发”Green”项目时，发现C缺少垃圾回收系统，还有可移植的安全性、分布程序设计、和多线程功能。最后，他们想要一种易于移植到各种设备上的平台。

Java确实是从C语言和C++语言继承了许多成份，甚至可以将Java看成是类C语言发展和衍生的产物。比如Java语言的变量声明，操作符形式，参数传递，流程控制等方面和C语言、C++语言完全相同。但同时，Java是一个纯粹的面向对象的程序设计语言，它继承了 C++语言面向对象技术的核心。Java舍弃了C语言中容易引起错误的指针（以引用取代）、运算符重载（operator overloading）、多重继承（以接口取代）等特性，增加了垃圾回收器功能用于回收不再被引用的对象所占据的内存空间。JDK1.5又引入了泛型编程（Generic Programming）、类型安全的枚举、不定长参数和自动装/拆箱



**4）java的特性** 

​      ①java语言是强壮的

​	丢弃了指针的概念，有了强类型机制，异常处理，垃圾的自动收集等保证了java的强壮性

​     ②安全性

​	java通常被使用在网络环境中，java提供了一个安全机制以防恶意代码的攻击（classLoader）

​     ③高性能

​	相比较那些高性能的脚本语言，java的性能是比较高的。

​    ④解释性

​	可被编译为字节码文件，可以在有java环境的任何平台上运行

   ⑤面向对象性

​	java提供类，继承，接口等语句，为了简单起见，只支持类之间的单继承，接口多继承，类和接口之间实现机制

  ⑥跨平台

​	因为有了JVM，同一个Java 程序在三个【win linux mac】不同的操作系统中都可以执行。这

​	样就实现了Java 程序的跨平台性



**5）java的发展史** 

1991年 Green项目，开发语言最初命名为Oak (橡树) 

1994年，开发组意识到Oak 非常适合于互联网

1996年，发布JDK 1.0，约8.3万个网页应用Java技术来制作

 1997年，发布JDK 1.1，JavaOne会议召开，创当时全球同类会议规模之最

1998年，发布JDK 1.2，同年发布企业平台J2EE

1999年，Java分成J2SE、J2EE和J2ME，JSP/Servlet技术诞生

2004年，发布里程碑式版本：JDK 1.5，为突出此版本的重要性，更名为JDK 5.0

 **2005年，J2SE -> JavaSE，J2EE -> JavaEE，J2ME -> JavaME** 

2009年，Oracle公司收购SUN，交易价格74亿美元

2011年，发布JDK 7.0

2014年，发布JDK 8.0，是继JDK 5.0以来变化最大的版本

 2017年，发布JDK 9.0，最大限度实现模块化

2018年3月，发布JDK 10.0，版本号也称为18.3

2018年9月，发布JDK 11.0，版本号也称为18.9



**6）java的技术体系** 

Java SE(Java Standard Edition)标准版

​	支持面向桌面级应用（如Windows下的应用程序）的Java平台，提供了完整的Java核 

​	心API，此版本以前称为J2SE

Java EE(Java Enterprise Edition)企业版

​	是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包含的技术如

​	:Servlet 、Jsp等，主要针对于Web应用程序开发。版本以前称为J2EE

Java ME(Java Micro Edition)小型版

​	支持Java程序运行在移动终端（手机、PDA）上的平台，对Java API有所精简，并加

​	入了针对移动终端的支持，此版本以前称为J2ME

Java Card

支持一些Java小程序（Applets）运行在小内存设备（如智能卡）上的平台



### 2.语言环境的搭建 

**1)什么是jdk  什么是jre** 

JDK(Java Development Kit Java开发工具包)

JDK是提供给Java开发人员使用的，其中包含了java的开发工具，也包括了

JRE。所以安装了JDK，就不用在单独安装JRE了。

其中的开发工具：编译工具(javac.exe) 打包工具(jar.exe)等



JRE(Java Runtime Environment Java运行环境) 


包括Java虚拟机(JVM Java Virtual Machine)和Java程序所需的核心类库等，

如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可



**2)下载jdk**  

www.oracle.com

java.sun.com



**3)安装jdk** 

傻瓜式安装全部点击下一步即可



**4）环境变量的配置**   

计算机---->属性---->高级---->环境变量

![](.\photo\2.jpg)



变量名：JAVA_HOME
变量值：jdk的安装路径 如：C:\Program Files\Java\jdk1.8.0_77

![](.\photo\3.jpg) 



在系统变量中找到 path 点击
变量名：path
变量值：%JAVA_HOME%\bin;   

![](.\photo\4.jpg)



新建:
变量名：classpath
变量值： .        .当前目录 .class文件所在路径，运行时需要的环境变量

![](.\photo\5.jpg) 





检测

都配完以后，检测下成功了就可以开始干活
在开始的位置找到运行点击（或者按win+R）
输入 cmd

![](.\photo\6.jpg)



分别输入 java -version     和    javac -version  出现自己的jdk版本号以及相关信息即配置成功



![](.\photo\7.jpg)



 ### 3.HelloWord

计算机认识的二进制文件，但是我们写的识英文。我们编写一个程序需要三个步骤：如下

**1）编写源文件【文件的扩展名打开】**

新建文本文件，将后缀名改为“.java”

~~~java
//public class 是固定的  后面的HelloWorld 是类名，类名需要和文件名一致
public class HelloWorld{
  
  //public static void 和括号里面的参数是固定的，俗称main方法的四要素
  //程序的入口，相当于楼房的大门
  public static void main(String [] args){
     
     //编写的程序代码，每一行语句结束需要以分号结尾
     System.out.println("helloWorld");
  }
}
~~~



**2）编译** 

​	 编译的时候会生产一个以“.class”  结尾的半机器语言

​	编译的命令： javac 类名.java

**3）运行** 

​	运行命令：java 类名

补充：

\n	另起一行 从头开始

\t	一个制表符【空格】



**4)常见错误**

①大括号成对出现

②“String”  中的s 需要大写

③我们编写的代码最后需要  “；”

④每个符号都需要是英文状态下的

⑤打印输出的内容都需要再双引号中

⑥增加代码的可读性

⑦类名一定要和文件名保持一致。



### 4.注释

什么叫注释？

给人看的不是个计算机看的 起到一种解释说明的作用。

**种类** 

单行注释   //

多行注释  /*  */

文档注释  /**    */

在dos中操作命令：

javadoc -d mydoc -autohr -version HelloWord.java



练习：

独立编写HelloJava程序，并配上必要的注释。

2. 将个人的基本信息（姓名、性别、籍贯、住址）打印到控制台上输出。各

   条信息分别占一行。

3. 结合\n(换行)，\t(制表符)，空格等在控制台打印出如下图所示的效果

![](.\photo\8.jpg) 



idea  快捷键：

sout:     System.out.println();

psvm:   public static void main(String[] args) {









## 第二章 变量和运算符

### 1.变量

**1）变量的概念** 

定义：内存中一个空间的表示，其值是可以发生变化的



说明：

~~~java

酒店中
房间  	---变量
房间号 	---变量名
房间类型    -- 数据类型
人		  --- 数值

~~~

在内存中 各个变量之间是相互独立的。

类别

在类以内方法以外声明的变量成为全局变量

在方法中声明的变量成为局部变量

成员变量分为：实例变量【不以static修饰】和类变量【以static修饰】

局部变量分为：形参【方法，构造器中声明的变量】，方法局部变量 【方法内】，代码块局部变量【代码块内定义】



**2）变量的使用**

1.声明变量[变量名不能重复]

int  num;

2.给变量赋值

```
num=100;
```

以上1  2 两个步骤可以合并

```
int  age=10;
```

3.使用变量

```
System.out.println(score);
```

```
int score=60;   
表示：在内存中声明一个int类型的空间，给这个空间起一个名字叫score 并且给空间赋值60.
```









**3）案列** 

```
double score=59.5;
char lev='c';
boolean flag=false;  //  true :通过  false :未通过
String  str="明天把你家长叫来";
```

**命名规则**  [但凡是自己起的名字都遵从以下规则]

由数字 字母  下划线 和美元符号组成其中不能以数字开头

不能是关键字

见名知意

驼峰命名规则



包名：多单词组成时所有字母都小写：xxxyyyzzz

类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz

变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个

单词首字母大写：xxxYyyZzz

常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ





关键字定义：被Java语言赋予了特殊含义，用做专门用途的字符串（单词）

特点：关键字中所有字母都为小写


![](.\photo\9.jpg) 









### 2.常量 

概念

定义：内存中一个空间的表示，其值是不可以发生变化的

如：我们计算圆的面积的时候就用用到一个常量  3.14

用法：

声明变量的时候 使用关键字  final 修饰  如：  

**final** double PI=3.14;



常量的命名规则：

常量名都需要大写，如果有多个单词组成的话，则使用下划线分割



案列



~~~java
		final  double   PI=3.14;
        //pi=4.14;
        double r=2;
        double  area =PI * r * r;
        System.out.println("圆的面积是："+area);
~~~







### 3.数据类型

**1基本数据类型**

数值型

​	整数类型

​	byte      1 字节  （-128~127）

​	short     2字节

​	int 	【默认】	4字节

​	long	8字节

如果你用long 表示需要在数值后面加“l”  或"L"

​	浮点数【数学中说得带小数点的数】

​	float      4字节

​	double【默认使用】   8字节



布尔类型

​	boolean     当结果只有两种的时候使用

字符型

​	char   表示的识单个字符且需要使用单引号引起了



2.引用数据类型【 可以表示多个字符  且需要使用双引号引起来】

String     接口   数组  枚举





### 4.变量的转换

**1）自动类型转换**

生活案例：你有两个大小不同的水杯，其中大杯子是空的小杯子是装满水。这个时候如果将装满水的小杯子倒进大杯子 就叫做自动类型转换

java中的话，就是用较大的数据类型接受较小的数据类型声明的值。

如： int num=10;

​	double m=num;

如果是自动类型转换的话，目标类型大于源类型



**2）强制类型转换**

​      生活案例：你有两个大小不同的水杯，其中小杯子是空的大杯子是装满水。这个时候如果将装满水的大杯子倒进小杯子 就叫做强制类型转换

java中的话，就是用较小的数据类型接受较大的数据类型声明的值。

如：

double nun=10;

int  m=(int)num;

如果需要强制类型转换的话，我们有要求：

①  目标类型  变量名 =（目标类型）较大的数据类型的值

​	double b=1.1;

​        int  	a=(int)b;

②当我们使用强制类型转换的时候，有可能谁丢失精度。慎用

③两种数据类型互相转换的话，需要是可以互相兼容的。

④如果在一个表达式中，有不同的数据类型的话，会自动将表达式结果提升为较大的数据类型。





练习

~~~java
	实现一个数字加密器，加密规则是
    加密结果 = （整数 * 10 + 5）/ 2 + 3.14159	
	加密结果仍为一整数

提示：
      // 原始数据
      int data = 100; 
      // 加密计算
      int result = (data * 10 + 5) / 2 + (int) 3.14159; 

~~~



~~~java
判断是否可以编译通过
1）short s = 5;
   s = s-2; //判断：no
2） byte b = 3;
    b = b + 4; //判断：no
    b = (byte)(b+4); //判断：yes
3）char c = ‘a’;
   int i = 5;
   float d = 0.314F;
   double result = c+i+d; //判断：yes
4） byte b = 5;
    short s = 3;
    short t = s + b; //判断：yes
~~~





### 5.Scanner

作用：可以和用户进行交互的一个类

步骤：

①导包：因为这个类是java给我们提供的，我们可以直接使用但是需要给别人打个招呼

import java.util.Scanner      /  import java.util.*

位置：package  一下  class  以上





②创建类

Scanner  sc = new Scanner(System.in);

其中sc  是自己起的名字 其他内容是语法规定，需要保持一样。



③使用，开始接收值

nextInt()    		接收整数类型的值

nextDoublle()	接收浮点数类型的值

next()			接收字符串



**使用** 

~~~java
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age=   sc.nextInt();
        System.out.println("请输入你的姓名：");
        String name =sc.next();
        System.out.println("请输入你的分数：");
        double score  =sc.nextDouble();
        System.out.println("年龄是："+age+",name:"+name+",score:"+score);
        
    }
}
~~~





### 6.运算符

**1)赋值运算符** 

​	=

**2)算术运算符** 



~~~java
+ -  *  /  %   ++  --
  
++ / --  在数值的面就先加1  后使用，在后面的话就先使用变量再加1
~~~





**3）关系运算符** 

~~~java

>  <   >=   <=     ！=   ....
关系运算符的运算  都会给我们产生一个boolean类型的结果


~~~



**4）逻辑运算符** 

true:真               false：假

| A     | B     | A &&B | A\|\|B |      |
| ----- | ----- | ----- | ------ | ---- |
| true  | true  | true  | true   |      |
| true  | false | false | true   |      |
| false | true  | false | true   |      |
| false | false | false | false  |      |

在逻辑表达式中  

&&  是 一假必假

||   是  一真必真

！     表示取反



**5）条件运算符** 【三目运算符】

~~~java

boolean类型表达式  ？  表达式1  ： 表达式2；

如果boolean的结果是true  ,则执行表达式1的结果，反之执行表达式2.


  
        int a =12;
        int b=4;
        String str=  a>b? "你好":"hello";
        System.out.println(str);
~~~





## 第三章 选择结构

### 1.if

**1) 基本if**

如果今天下雨我就带伞

语法：

~~~java

if(boolean类型的表达式){
   结果为true的时候执行的内容
  
}


~~~

~~~java
      int age=18;
        if(age<18){
            System.out.println("免费...");
        }
        System.out.println("程序结束");		
~~~



**2)if-else**  

如果今天下雨我就带伞.否则就不带伞

~~~java
if(boolean类型的表达式){
   结果为true的时候执行的内容
  
}else{
   结果为false的时候执行的内容
}
~~~

~~~java
        int age=13;
       
        if(age<18){
            System.out.println("免费...");
        }else{
            System.out.println("门票20元");
        }
        System.out.println("程序结束");
~~~







练习

~~~java
1.如果张浩的Java考试成绩大于98分，张浩就能获得一个MP4作为奖励

2.  张浩的Java成绩大于98分，而且音乐成绩大于80分，老师会奖励他；或者Java成绩等于100分，音乐成绩大于70       分，老师也会奖励他
  
3.如果张浩Java考试成绩大于98分，老师就奖励他一个MP4，否则老师就罚他进行编码

4.如果体彩中了500万，我买车、资助希望工程、去欧洲旅游
  如果没中，我买下一期体彩，继续烧高香


~~~







**3) 多重if**

场景：如果考试的分数大于90分 等级是A  大于80分  B  ,大于60  c  其他情况 则为D;

~~~JAVA

if(){
  
}else if(){
  
}else if(){

}


~~~

~~~JAVA
 Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        double score=sc.nextDouble();

        if(score>90){
            System.out.println("A");
        }else if(score>80){
            System.out.println("B");
        }else if(score>60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }


        System.out.println("程序结束");
~~~



在多重if选择结构中，条件需要按照一定的顺序去编写，不能乱，乱了就会对结果产生影响，因为满足第一个条件的时候就不会再继续向下执行了。



**4) 嵌套if**

跑步比赛，进决赛【10s内】的运动员分男子女子进行决赛。





~~~java


if(){
  
    if(){}else{}
  
}else{
  
}


~~~



~~~java
 Scanner sc = new Scanner(System.in);
        System.out.println("请输入跑步的成绩：");
        int se=sc.nextInt();
        if(se<10){
           // System.out.println("进入决赛");
            System.out.println("请输入性别：");
            String sex=sc.next();

            if("男".equals(sex)){
                System.out.println("男子组");
            }else{
                System.out.println("女子组");
            }
        }else{
            System.out.println("明年再来");
        }

~~~



当我们比较字符串的时候使用equals()，将肯定有的值放在equals()前面，不确定会有值的放在equals的括号里。



==   和  equals()的区别是什么

==  ：当==比较的是整数类型的时候 比较的是数值，当比较的内容是字符串的时候比较的是的地址值‘

equals（）：如果没有进行对equals()方法的重写的话它得规则和==是一样的，如果重写了，就按照重写的方法		   去比较







### 2.switch

有if为什么还需要有switch? 他们的使用场景是什么

~~~java
韩嫣参加计算机编程大赛
如果获得第一名，将参加麻省理工大学组织的1个月夏令营
如果获得第二名，将奖励惠普笔记本电脑一部
如果获得第三名，将奖励移动硬盘一个
否则，不给任何奖励

~~~

if选择结构更擅长判断区间值情况，而switch 更擅长去判断使用在等值的情况下。

~~~java

switch(变量){    变量可以是   byte  short  int  jdk1.7之后String
    
   case 常量1：
  		break;
           
    case 常量2：
      	break;
 
    default:
           
           break;
              
}

其中常量值是不可以重复的，default在最后的时候后面的break可以省略，在其他位置的时候不可以省略。
breaK表示的是执行完当前的case 之后结束。


~~~





~~~java
 		Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        double score=sc.nextDouble();

        if(score>90){
            System.out.println("A");
        }else if(score>80){
            System.out.println("B");
        }else if(score>60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }


        System.out.println("程序结束");
~~~

















## 第四章 循环结构

​	Q什么是循环？为什么要有循环？生活中的循环有哪些

### 1while循环



###2.do-while循环



###3.for循环



###4.break 和continue的运用









## 第五章 数组

###1.数组的概念和语法



###2.数组的常规应用







## 项目 吃货联盟

~~~java
我要订餐
查看餐袋
签收订单
删除订单
我要点赞
退出系统
~~~

![](.\photo\10.jpg) 







