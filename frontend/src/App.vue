<template>
  <div id="App">
      <navBar>
      </navBar>
      <router-view/>


  </div>
</template>

<script type="text/javascript">
    import navBar from './components/navBar.vue'
    export default{
        components:{
            navBar // register component
        }
    }

</script>
<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
