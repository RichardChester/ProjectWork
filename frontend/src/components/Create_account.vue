<template>
    <div>
        <table style="width:50%">
            <tr>
                <th>Firstname</th>
                <th><input v-model = "Form.firstName"></th>

            </tr>
            <tr>
                <th>Lastname</th>
                <td><input v-model = "Form.secondName"></td>

            </tr>
            <tr>
                <th>Account number</th>
                <td>
                    <input v-model = "Form.accountNumber"></td>
            </tr>
        </table>
        <b-container class="m-auto">
        <button type="submit" @click="onSubmit">Submit</button>
        </b-container>
    </div>
</template>

<script>
    import axios from 'axios'
    export default {
        name: 'Create_account',
        data(){
            return{
                Form:{
                    accountNumber:'',
                    firstName: '',
                    secondName: '',
                }
            }
        },
        methods: {
            onSubmit (){
                console.log(this.Form);
                axios.post('http://localhost:8010/user/create',this.Form)
                    .then(response => {
                        if(response.status===200){
                            this.$router.push('/');
                        }
                    })
            }
        }
    }

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

    h3 {
        margin: 40px 0 0;
    }
    ul {
        list-style-type: none;
        padding: 0;
    }
    li {
        display: inline-block;
        margin: 0 10px;
    }
    a {
        color: #42b983;
    }
    .active {
        background-color: aqua;
    }
</style>
