### README (English)

# Coffee Machine Project

## Overview
**Coffee Machine** is a training project developed as part of an **Object-Oriented Programming (OOP)** course at **Palestine Polytechnic University**. The project was built using **Java** and connected to a **database using XAMPP**. This virtual coffee machine allows users to input coffee beans and water, simulating the process of making coffee. The main purpose of this project is to help students understand and apply OOP principles, such as inheritance, exceptions, and polymorphism.

## Purpose
The goal of this project is to provide a practical, hands-on example of OOP concepts in Java. By building a virtual coffee machine, students are able to:
- **Understand Inheritance**: Extending classes to add or modify the functionality of the coffee machine, such as creating different types of coffee.
- **Handle Exceptions**: Managing errors and exceptions that occur during the coffee-making process, like running out of water or beans.
- **Apply Polymorphism**: Using polymorphism to handle different coffee-making processes for different types of coffee (e.g., espresso, latte, cappuccino).

In addition, the project covers other important OOP concepts such as:
- **Encapsulation**: Protecting the internal state of the coffee machine by using private variables and providing public methods to interact with the machine.
- **Abstraction**: Simplifying the coffee-making process by creating abstract methods for different coffee types, allowing future development and extension of new features.
  
## Features
- **Virtual Coffee Machine**: Simulates a real-world coffee machine that brews coffee based on user inputs.
- **Coffee Beans and Water Input**: Users input the amount of coffee beans and water, and the machine calculates the required amount to make coffee.
- **Error Handling**: The machine checks for sufficient water and beans before starting the coffee-making process, and prompts the user if resources are insufficient.
- **Different Coffee Types**: The system allows for the creation of different coffee types (e.g., espresso, cappuccino), demonstrating the power of inheritance and polymorphism in OOP.
- **Database Integration**: The project uses a database (via XAMPP) to store coffee-related data, like user preferences and coffee orders.

## Technologies Used
- **Programming Language**: Java
- **Database**: XAMPP (MySQL)

## How It Works
1. **User Input**: The user provides the amount of coffee beans and water needed for the coffee.
2. **Coffee Brewing**: The virtual machine processes the inputs and brews the coffee. It supports different coffee types by leveraging polymorphism.
3. **Exception Handling**: If there is not enough water or beans, an exception is thrown, and the user is notified to refill.
4. **Database**: User preferences and coffee orders are stored in a database, allowing for future enhancements such as user profiles and saved orders.

---

### README (Arabic)

# مشروع ماكينة القهوة

## نظرة عامة
**ماكينة القهوة** هو مشروع تدريبي تم تطويره كجزء من **مساق البرمجة الشيئية (OOP)** في **جامعة بوليتكنك فلسطين**. تم بناء المشروع باستخدام **لغة Java** وربطه بقاعدة بيانات باستخدام **XAMPP**. تحاكي هذه الماكينة الافتراضية عملية تحضير القهوة حيث يمكن للمستخدم إدخال كمية البن والماء لصنع القهوة. الهدف الرئيسي من هذا المشروع هو مساعدة الطلاب على فهم وتطبيق مبادئ OOP مثل الوراثة، الاستثناءات، والبوليمورفيزم.

## الهدف
الهدف من هذا المشروع هو تقديم مثال عملي لمفاهيم البرمجة الشيئية باستخدام لغة Java. من خلال بناء ماكينة قهوة افتراضية، يستطيع الطلاب:
- **فهم الوراثة**: توسيع الصفوف (classes) لإضافة أو تعديل وظائف ماكينة القهوة، مثل إنشاء أنواع مختلفة من القهوة.
- **التعامل مع الاستثناءات**: إدارة الأخطاء والاستثناءات التي تحدث أثناء عملية صنع القهوة، مثل نفاد الماء أو البن.
- **تطبيق البوليمورفيزم**: استخدام البوليمورفيزم للتعامل مع عمليات صنع قهوة مختلفة لأنواع القهوة المتعددة (مثل الإسبريسو واللاتيه والكابتشينو).

بالإضافة إلى ذلك، يغطي المشروع مفاهيم OOP الأخرى مثل:
- **التغليف (Encapsulation)**: حماية حالة ماكينة القهوة الداخلية باستخدام المتغيرات الخاصة وتوفير طرق عامة للتفاعل مع الماكينة.
- **التجريد (Abstraction)**: تبسيط عملية صنع القهوة من خلال إنشاء طرق مجردة (abstract methods) لأنواع القهوة المختلفة، مما يسمح بتطوير ميزات جديدة مستقبلاً.

## الميزات
- **ماكينة قهوة افتراضية**: تحاكي ماكينة قهوة حقيقية تقوم بتحضير القهوة بناءً على مدخلات المستخدم.
- **إدخال البن والماء**: يقوم المستخدم بإدخال كمية البن والماء، وتقوم الماكينة بحساب الكمية المطلوبة لتحضير القهوة.
- **التعامل مع الأخطاء**: تتحقق الماكينة من توفر الكمية الكافية من الماء والبن قبل بدء عملية تحضير القهوة، وتنبه المستخدم إذا كانت الموارد غير كافية.
- **أنواع قهوة مختلفة**: يتيح النظام إنشاء أنواع قهوة متعددة (مثل الإسبريسو والكابتشينو)، مما يظهر قوة الوراثة والبوليمورفيزم في البرمجة الشيئية.
- **تكامل قاعدة البيانات**: يستخدم المشروع قاعدة بيانات (عبر XAMPP) لتخزين بيانات القهوة مثل تفضيلات المستخدمين وطلبات القهوة.

## التقنيات المستخدمة
- **لغة البرمجة**: Java
- **قاعدة البيانات**: XAMPP (MySQL)

## كيفية عمل التطبيق
1. **مدخلات المستخدم**: يقوم المستخدم بتحديد كمية البن والماء اللازمة لتحضير القهوة.
2. **تحضير القهوة**: تقوم الماكينة الافتراضية بمعالجة المدخلات وتحضير القهوة. تدعم أنواع قهوة متعددة باستخدام البوليمورفيزم.
3. **التعامل مع الاستثناءات**: إذا لم تكن الكمية كافية من الماء أو البن، يتم رفع استثناء ويتم إعلام المستخدم بضرورة إعادة التعبئة.
4. **قاعدة البيانات**: يتم تخزين تفضيلات المستخدم وطلبات القهوة في قاعدة البيانات، مما يتيح تحسينات مستقبلية مثل ملفات تعريف المستخدمين والطلبات المحفوظة.


