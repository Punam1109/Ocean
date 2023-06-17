// Home page JS
const newLead = document.getElementById("new-lead")

newLead?.addEventListener("click", function(){
    window.location.href = "personal-details.html";
})

//-----------------------------------------------------------------------------------------------

// Personal details page JS
const personalNxt = document.getElementById("personal-nxt")

personalNxt?.addEventListener("click", function(){
    window.location.href = "income-details.html";
})
//-----------------------------------------------------------------------------------------------

// Income Details page JS
const personalBack = document.getElementById("personal-back")

personalBack?.addEventListener("click", function(){
    window.location.href = "app.component.html";
})


//-----------------------------------------------------------------------------------------------

// Income Details page JS
const incomeBack = document.getElementById("income-back")

incomeBack?.addEventListener("click", function(){
    window.location.href = "personal-details.html";
})

//-----------------------------------------------------------------------------------------------

const incomeNxt = document.getElementById("income-next")

incomeNxt?.addEventListener("click", function(){
    window.location.href = "documents.html";
})

//-----------------------------------------------------------------------------------------------

// Documents page Js

const documentsBack = document.getElementById("documents-back")

documentsBack?.addEventListener("click", function(){
    window.location.href = "income-details.html";
})

//-----------------------------------------------------------------------------------------------

const documentsNxt = document.getElementById("documents-nxt")

documentsNxt?.addEventListener("click", function(){
    window.location.href = "quotation.html";
})

//-----------------------------------------------------------------------------------------------

// Quotation page Js

const quotationBack = document.getElementById("quotation-back")

quotationBack?.addEventListener("click", function(){
    window.location.href = "documents.html";
})

 //-----------------------------------------------------------------------------------------------

const quotationNxt = document.getElementById("quotation-nxt")

quotationNxt?.addEventListener("click", function(){
    alert("Payment Link is Sent .....!")
})

 //-----------------------------------------------------------------------------------------------

 const viewBenifits = document.getElementById("view-benifits")

 viewBenifits?.addEventListener("click", function(){
     alert("Benifits of this quotation .....!")
 })
 
 //-----------------------------------------------------------------------------------------------


 const smokerButtons = document.querySelectorAll('.smoker-form button');
 const alcoholicButtons = document.querySelectorAll('.alcoholic-form button');

 function handleButtonClick(buttons) {
   buttons.forEach(button => {
     button.addEventListener('click', function(){
       buttons.forEach(btn => btn.classList.remove('selected'));
       button.classList.add('selected');
     });
   });
 }

 handleButtonClick(smokerButtons);
 handleButtonClick(alcoholicButtons);

 //-----------------------------------------------------------------------------------------------

 function selectFamilyMember(member, event) {
    event.preventDefault(); // Prevent default form submission behavior
    
    // Reset all button styles
    var buttons = document.getElementsByClassName('button');
    for (var i = 0; i < buttons.length; i++) {
      buttons[i].style.backgroundColor = '#fff';
    }
    
    // Set selected button style
    var selectedButton = document.getElementById(member + 'Btn');
    selectedButton.style.backgroundColor = 'rgb(21, 165, 221)';
    
    // Perform any other actions based on the selected family member
    console.log('Selected:', member);
  }

 //-----------------------------------------------------------------------------------------------

