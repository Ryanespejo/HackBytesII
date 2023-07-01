import { createApp } from 'vue'
import App from './App.vue'
createApp(App).mount('#app')
document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('address');
    const streetInput = document.getElementById('street');
    const cityInput = document.getElementById('city');
    const stateInput = document.getElementById('state');
    const zipInput = document.getElementById('zip');
  
    form.addEventListener('submit', handleSubmit);
  
    function handleSubmit(event) {
      event.preventDefault();
      
      const street = streetInput.value;
      const city = cityInput.value;
      const state = stateInput.value;
      const zip = zipInput.value;
  
      // Perform any further processing or validation here
      // You can access the entered values using the variables above
      console.log('Street:', street);
      console.log('City:', city);
      console.log('State:', state);
      console.log('Zip Code:', zip);
      
      // Reset the form
      form.reset();
    }
  });