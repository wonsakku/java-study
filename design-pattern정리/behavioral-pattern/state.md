# 상태 패턴(state pattern)


## Design Patterns (프로텍미디어)

<br>

## 1. 의도  

<br>

> 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 허가하는 패턴으로,  
> 이렇게 하면 객체는 마치 자신의 클래스를 바꾸는 것처럼 보입니다.   

<br>

___

<br>

## 2. 활용성  

<br>

다음 상황 가운데 하나에 속하면 상태 패턴을 사용할 수 있습니다.  

* 객체의 행동이 상태에 따라 달리질 수 있고, 객체의 상태에 따라서 런터임에 행동이 바뀌어야 합니다.    
* 어떤 연산에 그 객체의 상태에 따라 달라지는 다중 분기 조건 처리가 너무 많이 들어있을 때.   
  객체의 상태를 표현하기 위해 상태를 하나 이상의 나열형 상수(enummerated constant)로 정의해야 합니다.  
  동일한 조건 문장들을 하나 이상의 연산에 중복 정의해야 할 때도 잦습니다.  
  이 때, 객체의 상태를 별도의 객체로 정의하면, 다른 객체들과 상관없이 그 객체의 상태를 다양화시킬 수 있습니다. 


<br>

___

<br>

## 3. 참여자  

<br>

* Context  
    * 사용자가 관심있는 인터페이스를 정의합니다.    
      객체의 현재 상태를 정의한 ConcreteState 서브클래스의 인스턴스를 유지, 관리합니다.

* State  
    * Context의 각 상태별로 필요한 행동을 캡슐화하여 인터페이스로 정의합니다.  
* ConcreteState 서브클래스들
    * 각 서브 클래스들은 Context의 상태에 따라 처리되어야 할 실제 행동을 구현합니다.  
      




<br>

___

<br>

## 4. 결과  

<br>

상태 패턴을 사용했을 때 나타나는 효과는 다음과 같습니다.  

***1. 상태에 따른 행동을 국소화하며, 서로 다른 상태에 대한 행동을 별도의 객체로 관리합니다.***   
  * 상태 패턴을 사용하면 임의의 한 상태에 관련된 모든 행동을 하나의 객체로 모을 수 있습니다.  
    
***2. 상태 전이를 명확하게 만듭니다.***   
  * 어떤 객체가 자신의 현재 상태를 오직 내부 데이터 값으로만 정의하면, 상태 전이는 명확한 표현을 갖지 못합니다.  
    단지 이 상태 변수에 값을 할당하는 문장 정도밖에는 되지 않습니다.  
    각 상태별로 별도의 객체를 만드는 것은 상태 전이를 명백하게 해주는 결과가 됩니다. 
  * 또한, State 객체는 Context 객체가 일관되지 않은 상태가 되는 것을 막아줄 수 있습니다. 
    
***3. 상태 객체는 공유될 수 있습니다.***   
  * 상태는 단지 타입으로만 표현되므로, State 객체는 인스턴스 변수없이 여러 Context 클래스의 인스턴스로도 객체를 공유할 수 있습니다. 
    

