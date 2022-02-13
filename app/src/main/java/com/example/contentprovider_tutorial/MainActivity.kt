package com.example.contentprovider_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/*ContentProvider
4대 컴포넌트(액티비티, 서비스, 브로드 리시버, 컨텐트 프로바이더) 중 하나.
데이터를 제공하는 역할을 함. 앱 간의 데이터를 공유하는 유일한 방법.
URI를 사용하여 접근한다.

ContentResolver
각 앱의 ContentProvider를 중계하는 역할을 한다.
ContentResolver가 URI를 요청하면, 그에 맞게 ContentProvider는 Database에서 데이터를 찾아서 ContentResolver를 통해 다른 앱에 전달한다.
ContentResolver는 Query로 ContentProvider를 이용해 데이터 CRUD가 가능하다.

android.Provider
연락처, 전화기록, 오디오, 비디오 등 네이티브 앱과의 소통을 하는 ContentProvider이다.
기본적으로 여러가지 메소드를 제공한다.

흐름으로 보자면 App -> URI -> ContentResolver -> ContentProvider -> DBClass -> SQLite
외부 앱이 URI를 ContentResolver에 보내면, ContentResolver는 URI를 해당하는 앱에 전송한다. 받은 앱은 받은 앱의 ContentProvider가 URI를 해석하고 DB 작업을 한다. 이 때, ContentProvider는 기본적으로 데이터를 다룰 수 있다.
URI를 해석하여 얻어낸 결과물을 ContentResolver에 반환한다.

1. ContentProvider를 상속한 클래스를 만든다.
2. URI로 데이터나 커서를 반환하는 함수 오버라이드해줌.
3. Manifest에서 Provider 등록.
4. ContentResolver 객체를 생성.
5. Manifest에 등록된 authority 정보를 URI로 해서 ContentResolver를 이용해 데이터를 구함.
 */